package com.fenxi365.openapi.client.model;

import java.math.BigDecimal;

public class VoucherQuery {

    private Long accountSetsId;
    private Integer codeStart;
    private Integer codeEnd;
    private Long createMember;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private Long subjectId;
    private String summary;
    private String word;
    private String remark;
    private String property;
    private String order;
    private int page = 1;
    private int pageSize = 20;

    public Long getAccountSetsId() {
        return accountSetsId;
    }

    public void setAccountSetsId(Long accountSetsId) {
        this.accountSetsId = accountSetsId;
    }

    public Integer getCodeStart() {
        return codeStart;
    }

    public void setCodeStart(Integer codeStart) {
        this.codeStart = codeStart;
    }

    public Integer getCodeEnd() {
        return codeEnd;
    }

    public void setCodeEnd(Integer codeEnd) {
        this.codeEnd = codeEnd;
    }

    public Long getCreateMember() {
        return createMember;
    }

    public void setCreateMember(Long createMember) {
        this.createMember = createMember;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
