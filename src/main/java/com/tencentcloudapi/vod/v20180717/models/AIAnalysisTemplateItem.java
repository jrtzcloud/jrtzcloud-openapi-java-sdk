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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisTemplateItem  extends AbstractModel{

    /**
    * 智能分析模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 智能分析模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能分析模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 智能分类任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private ClassificationConfigureInfo ClassificationConfigure;

    /**
    * 智能标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfo TagConfigure;

    /**
    * 智能封面任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfo CoverConfigure;

    /**
    * 智能按帧标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfo FrameTagConfigure;

    /**
    * 智能精彩集锦任务控制参数。
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfo HighlightConfigure;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取智能分析模板唯一标识。
     * @return Definition 智能分析模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置智能分析模板唯一标识。
     * @param Definition 智能分析模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取智能分析模板名称。
     * @return Name 智能分析模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置智能分析模板名称。
     * @param Name 智能分析模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取智能分析模板描述信息。
     * @return Comment 智能分析模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置智能分析模板描述信息。
     * @param Comment 智能分析模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 获取智能分类任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClassificationConfigure 智能分类任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassificationConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * 设置智能分类任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationConfigure 智能分类任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationConfigure(ClassificationConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * 获取智能标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TagConfigure 智能标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * 设置智能标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagConfigure 智能标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagConfigure(TagConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * 获取智能封面任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoverConfigure 智能封面任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CoverConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * 设置智能封面任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverConfigure 智能封面任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverConfigure(CoverConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * 获取智能按帧标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FrameTagConfigure 智能按帧标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrameTagConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * 设置智能按帧标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameTagConfigure 智能按帧标签任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameTagConfigure(FrameTagConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * 获取智能精彩集锦任务控制参数。
     * @return HighlightConfigure 智能精彩集锦任务控制参数。
     */
    public HighlightsConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * 设置智能精彩集锦任务控制参数。
     * @param HighlightConfigure 智能精彩集锦任务控制参数。
     */
    public void setHighlightConfigure(HighlightsConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * 获取模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ClassificationConfigure.", this.ClassificationConfigure);
        this.setParamObj(map, prefix + "TagConfigure.", this.TagConfigure);
        this.setParamObj(map, prefix + "CoverConfigure.", this.CoverConfigure);
        this.setParamObj(map, prefix + "FrameTagConfigure.", this.FrameTagConfigure);
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

