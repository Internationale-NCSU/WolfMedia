package com.wolfmediabackend.bean;

import java.util.Date;

public class paidHost {
    private Integer paidHostId;

    private Integer id;

    private Integer paidStreamingAccountId;

    private String amount;

    private Date date;

    public Integer getPaidHostId() {
        return paidHostId;
    }

    public void setPaidHostId(Integer paidHostId) {
        this.paidHostId = paidHostId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaidStreamingAccountId() {
        return paidStreamingAccountId;
    }

    public void setPaidStreamingAccountId(Integer paidStreamingAccountId) {
        this.paidStreamingAccountId = paidStreamingAccountId;
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