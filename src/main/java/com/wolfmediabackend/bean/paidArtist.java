package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class paidArtist {
    private Integer id;

    private Integer paidArtistId;

    private Integer paidRecordLabelId;

    private String amount;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaidArtistId() {
        return paidArtistId;
    }

    public void setPaidArtistId(Integer paidArtistId) {
        this.paidArtistId = paidArtistId;
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