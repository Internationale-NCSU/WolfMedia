package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class paidService {
    private Integer id;

    private Integer paidUserId;

    private Integer paidStreamingAccountId;

    private String monthlySubscriptionFee;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaidUserId() {
        return paidUserId;
    }

    public void setPaidUserId(Integer paidUserId) {
        this.paidUserId = paidUserId;
    }

    public Integer getPaidStreamingAccountId() {
        return paidStreamingAccountId;
    }

    public void setPaidStreamingAccountId(Integer paidStreamingAccountId) {
        this.paidStreamingAccountId = paidStreamingAccountId;
    }

    public String getMonthlySubscriptionFee() {
        return monthlySubscriptionFee;
    }

    public void setMonthlySubscriptionFee(String monthlySubscriptionFee) {
        this.monthlySubscriptionFee = monthlySubscriptionFee == null ? null : monthlySubscriptionFee.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}