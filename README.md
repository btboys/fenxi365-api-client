# Fenxi365 API Client

Java 客户端 SDK，用于对接纷析云财务业务系统 Open API。

GitHub: [https://github.com/btboys/fenxi365-api-client](https://github.com/btboys/fenxi365-api-client)

## 安装

### Gradle

```groovy
implementation 'com.fenxi365:fenxi365-api-client:1.0.0'
```

### Maven

```xml
<dependency>
    <groupId>com.fenxi365</groupId>
    <artifactId>fenxi365-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 快速开始

```java
Fenxi365Client client = new Fenxi365Client("https://api.fenxi365.com", "your-api-key");

// 查询账套列表
JsonResult<PageResult<AccountSetsDto>> result = client.accountSets().list(null, 1, 20, null);
if (result.isSuccess()) {
    for (AccountSetsDto as : result.getData().getResults()) {
        System.out.println(as.getCompanyName());
    }
}

// 创建凭证（链式指定账套）
VoucherDto voucher = new VoucherDto();
voucher.setWord("记");
voucher.setCode(1);
voucher.setVoucherDate(LocalDate.now());
voucher.setDetails(Arrays.asList(
    new VoucherDetailsDto() {{ setSummary("办公用品"); setSubjectId(1001L); setDebitAmount(new BigDecimal("500")); }},
    new VoucherDetailsDto() {{ setSummary("办公用品"); setSubjectId(2001L); setCreditAmount(new BigDecimal("500")); }}
));
JsonResult<VoucherDto> created = client.voucher().withAccountSetId(123L).create(voucher);

// 线程级别账套（连续调用无需重复设置）
client.setAccountSetId(123L);
client.voucher().list(query);
client.customer().list(1, 20);
client.clearAccountSetId();

// 批量推送业务数据
List<TripartiteDataDto> dataList = List.of(
        new TripartiteDataDto() {{
            setPrimaryValue("INV-001");
        }}
);
client.tripartite().withAccountSetId(123L).batchPush("SALE_ORDER", dataList, "BATCH-001");
```

## API 列表

| 分类 | 类 | 功能 |
|------|------|------|
| 基础数据 | `accountSets()` | 账套列表、创建 |
| 辅助数据/科目 | `subject()` | 科目列表 |
| 辅助数据/币别 | `currency()` | 币别 CRUD |
| 辅助数据/凭证字 | `voucherWord()` | 凭证字 CRUD |
| 辅助核算/类别 | `accountingCategory()` | 辅助核算类别 CRUD |
| 辅助核算/客户 | `customer()` | 客户 CRUD |
| 辅助核算/供应商 | `vendor()` | 供应商 CRUD |
| 辅助核算/职员 | `employee()` | 职员 CRUD |
| 辅助核算/部门 | `department()` | 部门 CRUD |
| 辅助核算/组织机构 | `organization()` | 组织机构 CRUD |
| 辅助核算/项目 | `project()` | 项目 CRUD |
| 辅助核算/存货 | `stocks()` | 存货 CRUD |
| 凭证操作 | `voucher()` | 凭证 CRUD、列表 |
| 业务凭证 | `tripartite()` | 数据源定义、数据推送/回撤 |

## 构建

```bash
./gradlew build
```

## 发布到 Maven Central

### 前提

1. 注册 [central.sonatype.com](https://central.sonatype.com)
2. 验证 `com.fenxi365` 命名空间所有权
3. 生成 Deployment Token

### 发布

```bash
export MAVEN_USERNAME=your-token-username
export MAVEN_PASSWORD=your-token-password
# GPG 签名配置（二选一）

# 方式一：本地 keyring 文件
export ORG_GRADLE_PROJECT_signingKeyId=your-key-id
export ORG_GRADLE_PROJECT_signingPassword=your-passphrase
export ORG_GRADLE_PROJECT_signingSecretKeyRingFile=/path/to/secring.gpg

# 方式二：环境变量（CI 友好）
export GPG_KEY_ID=your-key-id
export GPG_PRIVATE_KEY="$(cat /path/to/private-key.asc)"
export GPG_PASSPHRASE=your-passphrase

./gradlew publishAllPublicationsToMavenCentralRepository
```
