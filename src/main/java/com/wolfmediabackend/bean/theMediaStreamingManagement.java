package com.wolfmediabackend.bean;

import java.math.BigDecimal;

public class theMediaStreamingManagement {
    private Integer streamingAccountId;

    private BigDecimal balance;

    public Integer getStreamingAccountId() {
        return streamingAccountId;
    }

    public void setStreamingAccountId(Integer streamingAccountId) {
        this.streamingAccountId = streamingAccountId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}