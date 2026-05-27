package com.fenxi365.openapi.client.model;

import java.util.List;

public class Subject {

    private Long id;
    private Long accountSetsId;
    private String type;
    private String code;
    private String queryCode;
    private String name;
    private String mnemonicCode;
    private String balanceDirection;
    private Boolean status;
    private Long parentId;
    private Integer level;
    private Boolean systemDefault;
    private Boolean cash;
    private String unit;
    private String fullName;
    private Boolean leaf;
    private Boolean adjustments;
    private String qualifiedType;
    private List<Long> auxiliaryAccounting;
    private List<Long> nonAuxiliaryAccounting;
    private List<Long> currencyAccounting;
    private Long cashFlowIn;
    private Long cashFlowOut;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQueryCode() {
        return queryCode;
    }

    public void setQueryCode(String queryCode) {
        this.queryCode = queryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(String balanceDirection) {
        this.balanceDirection = balanceDirection;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getSystemDefault() {
        return systemDefault;
    }

    public void setSystemDefault(Boolean systemDefault) {
        this.systemDefault = systemDefault;
    }

    public Boolean getCash() {
        return cash;
    }

    public void setCash(Boolean cash) {
        this.cash = cash;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(Boolean adjustments) {
        this.adjustments = adjustments;
    }

    public String getQualifiedType() {
        return qualifiedType;
    }

    public void setQualifiedType(String qualifiedType) {
        this.qualifiedType = qualifiedType;
    }

    public List<Long> getAuxiliaryAccounting() {
        return auxiliaryAccounting;
    }

    public void setAuxiliaryAccounting(List<Long> auxiliaryAccounting) {
        this.auxiliaryAccounting = auxiliaryAccounting;
    }

    public List<Long> getNonAuxiliaryAccounting() {
        return nonAuxiliaryAccounting;
    }

    public void setNonAuxiliaryAccounting(List<Long> nonAuxiliaryAccounting) {
        this.nonAuxiliaryAccounting = nonAuxiliaryAccounting;
    }

    public List<Long> getCurrencyAccounting() {
        return currencyAccounting;
    }

    public void setCurrencyAccounting(List<Long> currencyAccounting) {
        this.currencyAccounting = currencyAccounting;
    }

    public Long getCashFlowIn() {
        return cashFlowIn;
    }

    public void setCashFlowIn(Long cashFlowIn) {
        this.cashFlowIn = cashFlowIn;
    }

    public Long getCashFlowOut() {
        return cashFlowOut;
    }

    public void setCashFlowOut(Long cashFlowOut) {
        this.cashFlowOut = cashFlowOut;
    }
}
