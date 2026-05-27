package com.fenxi365.openapi.client.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class VoucherDto {

    private Long id;
    private String word;
    private Integer code;
    private String remark;
    private Integer receiptNum;
    private Long createMember;
    private String createMemberName;
    private LocalDateTime createDate;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private Long accountSetsId;
    private Integer year;
    private Integer month;
    private LocalDate voucherDate;
    private Long auditMemberId;
    private String auditMemberName;
    private LocalDateTime auditDate;
    private Long lastUpdateMember;
    private String lastUpdateMemberName;
    private LocalDateTime lastUpdateDate;
    private Boolean carryForward;
    private List<VoucherDetailsDto> details;
    private Boolean isTemplate;
    private String templateName;
    private String printTitle;
    private Long reverseVoucherId;
    private Long cashierId;
    private Boolean cash;
    private String cashierName;
    private String tid;
    private String cashMsg;
    private Boolean showCashFlowEditor;
    private List<Long> businessIds;
    private String businessType;
    private List<Long> invoiceIds;
    private Long invoiceId;
    private Long journalId;
    private List<Long> journalIds;
    private Long cashierTransferId;
    private List<Long> cashierTransferIds;
    private Boolean locked;
    private Boolean insert;
    private Long checkTplId;
    private String yearMonth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(Integer receiptNum) {
        this.receiptNum = receiptNum;
    }

    public Long getCreateMember() {
        return createMember;
    }

    public void setCreateMember(Long createMember) {
        this.createMember = createMember;
    }

    public String getCreateMemberName() {
        return createMemberName;
    }

    public void setCreateMemberName(String createMemberName) {
        this.createMemberName = createMemberName;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
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

    public Long getAccountSetsId() {
        return accountSetsId;
    }

    public void setAccountSetsId(Long accountSetsId) {
        this.accountSetsId = accountSetsId;
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

    public Long getAuditMemberId() {
        return auditMemberId;
    }

    public void setAuditMemberId(Long auditMemberId) {
        this.auditMemberId = auditMemberId;
    }

    public String getAuditMemberName() {
        return auditMemberName;
    }

    public void setAuditMemberName(String auditMemberName) {
        this.auditMemberName = auditMemberName;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public Long getLastUpdateMember() {
        return lastUpdateMember;
    }

    public void setLastUpdateMember(Long lastUpdateMember) {
        this.lastUpdateMember = lastUpdateMember;
    }

    public String getLastUpdateMemberName() {
        return lastUpdateMemberName;
    }

    public void setLastUpdateMemberName(String lastUpdateMemberName) {
        this.lastUpdateMemberName = lastUpdateMemberName;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Boolean getCarryForward() {
        return carryForward;
    }

    public void setCarryForward(Boolean carryForward) {
        this.carryForward = carryForward;
    }

    public List<VoucherDetailsDto> getDetails() {
        return details;
    }

    public void setDetails(List<VoucherDetailsDto> details) {
        this.details = details;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getPrintTitle() {
        return printTitle;
    }

    public void setPrintTitle(String printTitle) {
        this.printTitle = printTitle;
    }

    public Long getReverseVoucherId() {
        return reverseVoucherId;
    }

    public void setReverseVoucherId(Long reverseVoucherId) {
        this.reverseVoucherId = reverseVoucherId;
    }

    public Long getCashierId() {
        return cashierId;
    }

    public void setCashierId(Long cashierId) {
        this.cashierId = cashierId;
    }

    public Boolean getCash() {
        return cash;
    }

    public void setCash(Boolean cash) {
        this.cash = cash;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCashMsg() {
        return cashMsg;
    }

    public void setCashMsg(String cashMsg) {
        this.cashMsg = cashMsg;
    }

    public Boolean getShowCashFlowEditor() {
        return showCashFlowEditor;
    }

    public void setShowCashFlowEditor(Boolean showCashFlowEditor) {
        this.showCashFlowEditor = showCashFlowEditor;
    }

    public List<Long> getBusinessIds() {
        return businessIds;
    }

    public void setBusinessIds(List<Long> businessIds) {
        this.businessIds = businessIds;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public List<Long> getInvoiceIds() {
        return invoiceIds;
    }

    public void setInvoiceIds(List<Long> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Long getJournalId() {
        return journalId;
    }

    public void setJournalId(Long journalId) {
        this.journalId = journalId;
    }

    public List<Long> getJournalIds() {
        return journalIds;
    }

    public void setJournalIds(List<Long> journalIds) {
        this.journalIds = journalIds;
    }

    public Long getCashierTransferId() {
        return cashierTransferId;
    }

    public void setCashierTransferId(Long cashierTransferId) {
        this.cashierTransferId = cashierTransferId;
    }

    public List<Long> getCashierTransferIds() {
        return cashierTransferIds;
    }

    public void setCashierTransferIds(List<Long> cashierTransferIds) {
        this.cashierTransferIds = cashierTransferIds;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Long getCheckTplId() {
        return checkTplId;
    }

    public void setCheckTplId(Long checkTplId) {
        this.checkTplId = checkTplId;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
}
