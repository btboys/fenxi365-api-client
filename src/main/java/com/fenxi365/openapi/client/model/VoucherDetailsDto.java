package com.fenxi365.openapi.client.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VoucherDetailsDto {

    private Long id;
    private Long accountSetsId;
    private Long voucherId;
    private Integer year;
    private Integer month;
    private LocalDate voucherDate;
    private Long currencyId;
    private String currencyName;
    private String currencyCode;
    private BigDecimal originalAmount;
    private String summary;
    private Long subjectId;
    private String subjectName;
    private String subjectCode;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private BigDecimal num;
    private BigDecimal price;
    private Long auxiliaryDetailId;
    private List<AcDetailsDto> auxiliary;
    private BigDecimal debitAmountFor;
    private BigDecimal creditAmountFor;
    private BigDecimal exchangeRate;
    private BigDecimal debitNum;
    private BigDecimal creditNum;
    private Boolean carryForward;
    private Boolean cashFlow;
    private Integer rowNum;
    private String unit;

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

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public LocalDate getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(LocalDate voucherDate) {
        this.voucherDate = voucherDate;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAuxiliaryDetailId() {
        return auxiliaryDetailId;
    }

    public void setAuxiliaryDetailId(Long auxiliaryDetailId) {
        this.auxiliaryDetailId = auxiliaryDetailId;
    }

    public List<AcDetailsDto> getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(List<AcDetailsDto> auxiliary) {
        this.auxiliary = auxiliary;
    }

    public BigDecimal getDebitAmountFor() {
        return debitAmountFor;
    }

    public void setDebitAmountFor(BigDecimal debitAmountFor) {
        this.debitAmountFor = debitAmountFor;
    }

    public BigDecimal getCreditAmountFor() {
        return creditAmountFor;
    }

    public void setCreditAmountFor(BigDecimal creditAmountFor) {
        this.creditAmountFor = creditAmountFor;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getDebitNum() {
        return debitNum;
    }

    public void setDebitNum(BigDecimal debitNum) {
        this.debitNum = debitNum;
    }

    public BigDecimal getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(BigDecimal creditNum) {
        this.creditNum = creditNum;
    }

    public Boolean getCarryForward() {
        return carryForward;
    }

    public void setCarryForward(Boolean carryForward) {
        this.carryForward = carryForward;
    }

    public Boolean getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(Boolean cashFlow) {
        this.cashFlow = cashFlow;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
