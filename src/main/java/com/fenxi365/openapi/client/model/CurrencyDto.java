package com.fenxi365.openapi.client.model;

import java.math.BigDecimal;

public class CurrencyDto {

    private Long id;
    private Long accountSetsId;
    private String code;
    private String name;
    private BigDecimal exchangeRate;
    private Boolean localCurrency;
    private Boolean enable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountSetsId() {
        return accountSetsId;
    }

    public void setAccountSetsId(Long accountSetsId) {
        this.accountSetsId = accountSetsId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Boolean getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(Boolean localCurrency) {
        this.localCurrency = localCurrency;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
