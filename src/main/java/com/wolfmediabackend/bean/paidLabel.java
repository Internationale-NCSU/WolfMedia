package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class paidLabel {
    private Integer paidStreamingAccountId;

    private Integer id;

    private Integer paidRecordLabelId;

    private String amount;

    private Date date;

    public Integer getPaidStreamingAccountId() {
        return paidStreamingAccountId;
    }

    public void setPaidStreamingAccountId(Integer paidStreamingAccountId) {
        this.paidStreamingAccountId = paidStreamingAccountId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaidRecordLabelId() {
        return paidRecordLabelId;
    }

    public void setPaidRecordLabelId(Integer paidRecordLabelId) {
        this.paidRecordLabelId = paidRecordLabelId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}