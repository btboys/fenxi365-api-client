package com.fenxi365.openapi.client.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class AccountSetsDto {

    private Long id;
    private String companyName;
    private LocalDate enableDate;
    private String creditCode;
    private String accountStandard;
    private String vatType;
    private String address;
    private Boolean cashierModule;
    private Integer industry;
    private Boolean fixedAssetModule;
    private Boolean voucherReviewed;
    private LocalDate currentAccountDate;
    private List<Integer> encoding;
    private List<Object> subjectCategory;
    private Boolean journal;
    private Boolean assets;
    private Boolean enabled;
    private Boolean imported;
    private String syncType;
    private String taxation;
    private Date createDate;
    private Long creatorId;
    private String creatorName;
    private String roleName;
    private Long voucherCount;
    private Long astId;
    private LocalDate effectiveDate;
    private String vcfEqCheck;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getEnableDate() {
        return enableDate;
    }

    public void setEnableDate(LocalDate enableDate) {
        this.enableDate = enableDate;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getAccountStandard() {
        return accountStandard;
    }

    public void setAccountStandard(String accountStandard) {
        this.accountStandard = accountStandard;
    }

    public String getVatType() {
        return vatType;
    }

    public void setVatType(String vatType) {
        this.vatType = vatType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getCashierModule() {
        return cashierModule;
    }

    public void setCashierModule(Boolean cashierModule) {
        this.cashierModule = cashierModule;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public Boolean getFixedAssetModule() {
        return fixedAssetModule;
    }

    public void setFixedAssetModule(Boolean fixedAssetModule) {
        this.fixedAssetModule = fixedAssetModule;
    }

    public Boolean getVoucherReviewed() {
        return voucherReviewed;
    }

    public void setVoucherReviewed(Boolean voucherReviewed) {
        this.voucherReviewed = voucherReviewed;
    }

    public LocalDate getCurrentAccountDate() {
        return currentAccountDate;
    }

    public void setCurrentAccountDate(LocalDate currentAccountDate) {
        this.currentAccountDate = currentAccountDate;
    }

    public List<Integer> getEncoding() {
        return encoding;
    }

    public void setEncoding(List<Integer> encoding) {
        this.encoding = encoding;
    }

    public List<Object> getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(List<Object> subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    public Boolean getJournal() {
        return journal;
    }

    public void setJournal(Boolean journal) {
        this.journal = journal;
    }

    public Boolean getAssets() {
        return assets;
    }

    public void setAssets(Boolean assets) {
        this.assets = assets;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getImported() {
        return imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public String getTaxation() {
        return taxation;
    }

    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getVoucherCount() {
        return voucherCount;
    }

    public void setVoucherCount(Long voucherCount) {
        this.voucherCount = voucherCount;
    }

    public Long getAstId() {
        return astId;
    }

    public void setAstId(Long astId) {
        this.astId = astId;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getVcfEqCheck() {
        return vcfEqCheck;
    }

    public void setVcfEqCheck(String vcfEqCheck) {
        this.vcfEqCheck = vcfEqCheck;
    }
}
