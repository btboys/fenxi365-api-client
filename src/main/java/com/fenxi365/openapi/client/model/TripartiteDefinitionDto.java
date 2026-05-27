package com.fenxi365.openapi.client.model;

import java.util.List;

public class TripartiteDefinitionDto {

    private Long id;
    private Long accountSetsId;
    private String name;
    private Integer pos;
    private String code;
    private String description;
    private Boolean enabled;
    private Long dataCount;
    private Long voucherCount;
    private List<DataField> dataFields;
    private List<VoucherTemplate> voucherTemplates;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getDataCount() {
        return dataCount;
    }

    public void setDataCount(Long dataCount) {
        this.dataCount = dataCount;
    }

    public Long getVoucherCount() {
        return voucherCount;
    }

    public void setVoucherCount(Long voucherCount) {
        this.voucherCount = voucherCount;
    }

    public List<DataField> getDataFields() {
        return dataFields;
    }

    public void setDataFields(List<DataField> dataFields) {
        this.dataFields = dataFields;
    }

    public List<VoucherTemplate> getVoucherTemplates() {
        return voucherTemplates;
    }

    public void setVoucherTemplates(List<VoucherTemplate> voucherTemplates) {
        this.voucherTemplates = voucherTemplates;
    }

    public static class DataField {
        private String displayName;
        private String fieldName;
        private String fieldType;
        private String description;
        private Boolean required;
        private Boolean primaryKey;
        private Boolean period;
        private String accountingCategoryType;
        private Long categoryTypeId;

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldType() {
            return fieldType;
        }

        public void setFieldType(String fieldType) {
            this.fieldType = fieldType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getRequired() {
            return required;
        }

        public void setRequired(Boolean required) {
            this.required = required;
        }

        public Boolean getPrimaryKey() {
            return primaryKey;
        }

        public void setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
        }

        public Boolean getPeriod() {
            return period;
        }

        public void setPeriod(Boolean period) {
            this.period = period;
        }

        public String getAccountingCategoryType() {
            return accountingCategoryType;
        }

        public void setAccountingCategoryType(String accountingCategoryType) {
            this.accountingCategoryType = accountingCategoryType;
        }

        public Long getCategoryTypeId() {
            return categoryTypeId;
        }

        public void setCategoryTypeId(Long categoryTypeId) {
            this.categoryTypeId = categoryTypeId;
        }
    }

    public static class VoucherTemplate {
        private String tid;
        private String voucherWord;
        private String dateFieldName;
        private List<String> summaryFieldNames;
        private List<VoucherTemplateItem> items;
        private List<VoucherTemplateRule> rules;

        public String getTid() {
            return tid;
        }

        public void setTid(String tid) {
            this.tid = tid;
        }

        public String getVoucherWord() {
            return voucherWord;
        }

        public void setVoucherWord(String voucherWord) {
            this.voucherWord = voucherWord;
        }

        public String getDateFieldName() {
            return dateFieldName;
        }

        public void setDateFieldName(String dateFieldName) {
            this.dateFieldName = dateFieldName;
        }

        public List<String> getSummaryFieldNames() {
            return summaryFieldNames;
        }

        public void setSummaryFieldNames(List<String> summaryFieldNames) {
            this.summaryFieldNames = summaryFieldNames;
        }

        public List<VoucherTemplateItem> getItems() {
            return items;
        }

        public void setItems(List<VoucherTemplateItem> items) {
            this.items = items;
        }

        public List<VoucherTemplateRule> getRules() {
            return rules;
        }

        public void setRules(List<VoucherTemplateRule> rules) {
            this.rules = rules;
        }
    }

    public static class VoucherTemplateItem {
        private String itemType;
        private Long subjectId;
        private String direction;
        private String amountFieldName;
        private Boolean autoEqual;
        private java.math.BigDecimal amountRatio;
        private String quantityFieldName;
        private String unitFieldName;
        private List<AuxiliaryFieldMapping> auxiliaryFieldMappings;

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public Long getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(Long subjectId) {
            this.subjectId = subjectId;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getAmountFieldName() {
            return amountFieldName;
        }

        public void setAmountFieldName(String amountFieldName) {
            this.amountFieldName = amountFieldName;
        }

        public Boolean getAutoEqual() {
            return autoEqual;
        }

        public void setAutoEqual(Boolean autoEqual) {
            this.autoEqual = autoEqual;
        }

        public java.math.BigDecimal getAmountRatio() {
            return amountRatio;
        }

        public void setAmountRatio(java.math.BigDecimal amountRatio) {
            this.amountRatio = amountRatio;
        }

        public String getQuantityFieldName() {
            return quantityFieldName;
        }

        public void setQuantityFieldName(String quantityFieldName) {
            this.quantityFieldName = quantityFieldName;
        }

        public String getUnitFieldName() {
            return unitFieldName;
        }

        public void setUnitFieldName(String unitFieldName) {
            this.unitFieldName = unitFieldName;
        }

        public List<AuxiliaryFieldMapping> getAuxiliaryFieldMappings() {
            return auxiliaryFieldMappings;
        }

        public void setAuxiliaryFieldMappings(List<AuxiliaryFieldMapping> auxiliaryFieldMappings) {
            this.auxiliaryFieldMappings = auxiliaryFieldMappings;
        }
    }

    public static class VoucherTemplateRule {
        private String fieldName;
        private List<String> matchValues;
        private String logical;

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public List<String> getMatchValues() {
            return matchValues;
        }

        public void setMatchValues(List<String> matchValues) {
            this.matchValues = matchValues;
        }

        public String getLogical() {
            return logical;
        }

        public void setLogical(String logical) {
            this.logical = logical;
        }
    }

    public static class AuxiliaryFieldMapping {
        private String categoryType;
        private String fieldName;

        public String getCategoryType() {
            return categoryType;
        }

        public void setCategoryType(String categoryType) {
            this.categoryType = categoryType;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }
    }
}
