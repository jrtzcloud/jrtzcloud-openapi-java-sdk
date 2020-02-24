package com.jrtzcloudapi.common.utils;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPUtils {

    public static String compress(String str) throws IOException {
        if (null == str || str.length() <= 0) {
            return null;
        }
        // 创建一个新的输出流
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // 使用默认缓冲区大小创建新的输出流
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        // 将字节写入此输出流
        gzip.write(str.getBytes("utf-8")); // 因为后台默认字符集有可能是GBK字符集，所以此处需指定一个字符集
        gzip.close();
        // 使用指定的 charsetName，通过解码字节将缓冲区内容转换为字符串
        return out.toString("ISO-8859-1");
    }

    public static String unCompress(String str) throws IOException {
        if (null == str || str.length() <= 0) {
            return str;
        }
        return unCompress(str.getBytes("ISO-8859-1"));
    }

    public static String unCompress(byte[] bytes) throws IOException {
        if (null == bytes || bytes.length <= 0) {
            return null;
        }
        // 创建一个新的输出流
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // 创建一个 ByteArrayInputStream，使用 buf 作为其缓冲 区数组
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        // 使用默认缓冲区大小创建新的输入流
        GZIPInputStream gzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n = 0;

        // 将未压缩数据读入字节数组
        while ((n = gzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        // 使用指定的 charsetName，通过解码字节将缓冲区内容转换为字符串
        return out.toString("utf-8");
    }

    public static void writeFile(String content, String path){
        // get the content in bytes
        byte[] contentInBytes = content.getBytes();
        writeFile(contentInBytes, path);
    }

    public static void writeFile(byte[] contentInBytes, String path){
        File file = new File(path);
        try (FileOutputStream fop = new FileOutputStream(file)) {

            // if file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String originJson = JsonUtil.readJsonFile(new File("C:/Users/lenovo/Desktop/temp/compresstest/meta-data-del.json"));
        String compress = compress(originJson);
        writeFile(compress, "C:/Users/lenovo/Desktop/temp/compresstest/gzip.gzip");
        String json = unCompress(compress);
        writeFile(json, "C:/Users/lenovo/Desktop/temp/compresstest/ungzip-gzip.json");

    }

}
