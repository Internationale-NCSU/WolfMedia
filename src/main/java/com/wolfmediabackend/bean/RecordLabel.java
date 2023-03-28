package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordLabel {
    private Integer recordLabelId;

    private String recordLabelName;

    public Integer getRecordLabelId() {
        return recordLabelId;
    }

    public void setRecordLabelId(Integer recordLabelId) {
        this.recordLabelId = recordLabelId;
    }

    public String getRecordLabelName() {
        return recordLabelName;
    }

    public void setRecordLabelName(String recordLabelName) {
        this.recordLabelName = recordLabelName == null ? null : recordLabelName.trim();
    }
}