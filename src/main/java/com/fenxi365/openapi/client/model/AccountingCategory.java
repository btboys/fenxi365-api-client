package com.fenxi365.openapi.client.model;

import java.util.List;

public class AccountingCategory {

    private Long id;
    private Long accountSetsId;
    private String categoryType;
    private String name;
    private List<AssistingAccountingColumn> columns;
    private Boolean systemDefault;
    private Boolean canEdit;

    public static class AssistingAccountingColumn {
        private String code;
        private String title;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

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

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AssistingAccountingColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<AssistingAccountingColumn> columns) {
        this.columns = columns;
    }

    public Boolean getSystemDefault() {
        return systemDefault;
    }

    public void setSystemDefault(Boolean systemDefault) {
        this.systemDefault = systemDefault;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }
}
