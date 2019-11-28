/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkInput  extends AbstractModel{

    /**
    * 水印模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
    * 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * 获取水印模板 ID。
     * @return Definition 水印模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置水印模板 ID。
     * @param Definition 水印模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
     * @return TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * 设置文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
     * @param TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * 获取SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
     * @return SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * 设置SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
     * @param SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * 获取水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     * @return StartTimeOffset 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * 设置水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     * @param StartTimeOffset 水印的起始时间偏移，单位：秒。不填或填0，表示水印从画面出现时开始显现。
<li>不填或填0，表示水印从画面开始就出现；</li>
<li>当数值大于0时（假设为 n），表示水印从画面开始的第 n 秒出现；</li>
<li>当数值小于0时（假设为 -n），表示水印从离画面结束 n 秒前开始出现。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * 获取水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     * @return EndTimeOffset 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * 设置水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     * @param EndTimeOffset 水印的结束时间偏移，单位：秒。
<li>不填或填0，表示水印持续到画面结束；</li>
<li>当数值大于0时（假设为 n），表示水印持续到第 n 秒时消失；</li>
<li>当数值小于0时（假设为 -n），表示水印持续到离画面结束 n 秒前消失。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SvgContent", this.SvgContent);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

