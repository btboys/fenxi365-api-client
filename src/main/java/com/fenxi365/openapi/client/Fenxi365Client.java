package com.fenxi365.openapi.client;

import com.fenxi365.openapi.client.api.*;

public class Fenxi365Client {

    private final ApiClient apiClient;

    private final AccountSetsApi accountSets;
    private final SubjectApi subject;
    private final CurrencyApi currency;
    private final VoucherWordApi voucherWord;
    private final AccountingCategoryApi accountingCategory;
    private final CustomerApi customer;
    private final VendorApi vendor;
    private final EmployeeApi employee;
    private final DepartmentApi department;
    private final OrganizationApi organization;
    private final ProjectApi project;
    private final StocksApi stocks;
    private final VoucherApi voucher;
    private final TripartiteApi tripartite;

    public Fenxi365Client(String baseUrl, String apiKey) {
        this(baseUrl, apiKey, "/api", 30, 30);
    }

    public Fenxi365Client(String baseUrl, String apiKey, String pathPrefix) {
        this(baseUrl, apiKey, pathPrefix, 30, 30);
    }

    public Fenxi365Client(String baseUrl, String apiKey, String pathPrefix, long connectTimeout, long readTimeout) {
        this.apiClient = new ApiClient(baseUrl, apiKey, pathPrefix, connectTimeout, readTimeout);
        this.accountSets = new AccountSetsApi(apiClient);
        this.subject = new SubjectApi(apiClient);
        this.currency = new CurrencyApi(apiClient);
        this.voucherWord = new VoucherWordApi(apiClient);
        this.accountingCategory = new AccountingCategoryApi(apiClient);
        this.customer = new CustomerApi(apiClient);
        this.vendor = new VendorApi(apiClient);
        this.employee = new EmployeeApi(apiClient);
        this.department = new DepartmentApi(apiClient);
        this.organization = new OrganizationApi(apiClient);
        this.project = new ProjectApi(apiClient);
        this.stocks = new StocksApi(apiClient);
        this.voucher = new VoucherApi(apiClient);
        this.tripartite = new TripartiteApi(apiClient);
    }

    public void setAccountSetId(Long accountSetId) {
        apiClient.setAccountSetId(accountSetId);
    }

    public void clearAccountSetId() {
        apiClient.clearAccountSetId();
    }

    public AccountSetsApi accountSets() { return accountSets; }
    public SubjectApi subject() { return subject; }
    public CurrencyApi currency() { return currency; }
    public VoucherWordApi voucherWord() { return voucherWord; }
    public AccountingCategoryApi accountingCategory() { return accountingCategory; }
    public CustomerApi customer() { return customer; }
    public VendorApi vendor() { return vendor; }
    public EmployeeApi employee() { return employee; }
    public DepartmentApi department() { return department; }
    public OrganizationApi organization() { return organization; }
    public ProjectApi project() { return project; }
    public StocksApi stocks() { return stocks; }
    public VoucherApi voucher() { return voucher; }
    public TripartiteApi tripartite() { return tripartite; }
}
