package com.jrtzcloudapi.common.utils;

//import android.support.annotation.Nullable;
//import android.util.Base64;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.*;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * DeflaterUtils 压缩字符串
 */
public class DeflaterUtils {
    /**
     * 压缩
     */
    public static byte[] zipString(String unzipString) {
        /**
         *     https://www.yiibai.com/javazip/javazip_deflater.html#article-start
         *     0 ~ 9 压缩等级 低到高
         *     public static final int BEST_COMPRESSION = 9;            最佳压缩的压缩级别。
         *     public static final int BEST_SPEED = 1;                  压缩级别最快的压缩。
         *     public static final int DEFAULT_COMPRESSION = -1;        默认压缩级别。
         *     public static final int DEFAULT_STRATEGY = 0;            默认压缩策略。
         *     public static final int DEFLATED = 8;                    压缩算法的压缩方法(目前唯一支持的压缩方法)。
         *     public static final int FILTERED = 1;                    压缩策略最适用于大部分数值较小且数据分布随机分布的数据。
         *     public static final int FULL_FLUSH = 3;                  压缩刷新模式，用于清除所有待处理的输出并重置拆卸器。
         *     public static final int HUFFMAN_ONLY = 2;                仅用于霍夫曼编码的压缩策略。
         *     public static final int NO_COMPRESSION = 0;              不压缩的压缩级别。
         *     public static final int NO_FLUSH = 0;                    用于实现最佳压缩结果的压缩刷新模式。
         *     public static final int SYNC_FLUSH = 2;                  用于清除所有未决输出的压缩刷新模式; 可能会降低某些压缩算法的压缩率。
         */
        //使用指定的压缩级别创建一个新的压缩器。
        Deflater deflater = new Deflater(Deflater.BEST_COMPRESSION);
        //设置压缩输入数据。
        deflater.setInput(unzipString.getBytes());
        //当被调用时，表示压缩应该以输入缓冲区的当前内容结束。
        deflater.finish();

        final byte[] bytes = new byte[256];
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(256);

        while (!deflater.finished()) {
            //压缩输入数据并用压缩数据填充指定的缓冲区。
            int length = deflater.deflate(bytes);
            outputStream.write(bytes, 0, length);
        }
        //关闭压缩器并丢弃任何未处理的输入。
        deflater.end();
//        return Base64.encodeToString(outputStream.toByteArray(), Base64.NO_PADDING);
        return outputStream.toByteArray();
//        return Base64.encode(outputStream.toByteArray());
    }

    /**
     * 解压缩
     */
    public static String unzipString(byte[] decode) throws Base64DecodingException {
//        byte[] decode = Base64.decode(zipString, Base64.NO_PADDING);
//        byte[] decode = Base64.decode(zipString);
        //创建一个新的解压缩器  https://www.yiibai.com/javazip/javazip_inflater.html
        Inflater inflater = new Inflater();
        //设置解压缩的输入数据。
        inflater.setInput(decode);

        final byte[] bytes = new byte[256];
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(256);
        try {
            //finished() 如果已到达压缩数据流的末尾，则返回true。
            while (!inflater.finished()) {
                //将字节解压缩到指定的缓冲区中。
                int length = inflater.inflate(bytes);
                outputStream.write(bytes, 0, length);
            }
        } catch (DataFormatException e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭解压缩器并丢弃任何未处理的输入。
            inflater.end();
        }

        return outputStream.toString();
    }

    private static void writeFile(String mapperJson, String fileName) {
        Writer write = null;
        try {
            File file = new File("", fileName);
//            Log.d(TAG, "file.exists():" + file.exists() + " file.getAbsolutePath():" + file.getAbsolutePath());
            // 如果父目录不存在，创建父目录
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            // 如果已存在,删除旧文件
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            // 将格式化后的字符串写入文件
            write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            write.write(mapperJson);
            write.flush();
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
//            Log.e(TAG, "e = " + Log.getStackTraceString(e));
        }finally {
            if (write != null){
                try {
                    write.close();
                } catch (IOException e) {
                    e.printStackTrace();
//                    Log.e(TAG, "e = " + Log.getStackTraceString(e));
                }
            }
        }
    }

    public static void main(String[] args) throws Base64DecodingException {
        //原始文件   stroke.json
//        String strokeJson = LocalFileUtils.getStringFormAsset(context, "stroke.json");
//        mapper = JSONUtil.toCollection(strokeJson, HashMap.class, String.class, Stroke.class);
        // 使用 Deflater  加密
//        String deFlaterStrokeJson = DeflaterUtils.zipString("strokeJson");
//        writeFile(deFlaterStrokeJson,"deFlaterStrokeJson.json");


        String originJson = JsonUtil.readJsonFile(new File("C:/Users/lenovo/Desktop/temp/compresstest/meta-data-del.json"));
        byte[] bytes = DeflaterUtils.zipString(originJson);
        GZIPUtils.writeFile(bytes, "C:/Users/lenovo/Desktop/temp/compresstest/deflater.zlib");
        String json = DeflaterUtils.unzipString(bytes);
        GZIPUtils.writeFile(json, "C:/Users/lenovo/Desktop/temp/compresstest/unDeflaterzlib.json");
    }
}