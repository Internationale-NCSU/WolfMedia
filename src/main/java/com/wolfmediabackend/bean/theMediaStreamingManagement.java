package com.wolfmediabackend.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
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