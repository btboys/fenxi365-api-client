package com.fenxi365.openapi.client;

import com.fenxi365.openapi.client.model.AccountSetsDto;
import com.fenxi365.openapi.client.model.JsonResult;
import com.fenxi365.openapi.client.model.PageResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 集成测试 - 使用真实 API Key 调用纷析云 Open API。
 * <p>
 * 运行前可通过环境变量或系统属性配置：
 * <ul>
 *   <li>{@code FENXI365_API_KEY} - API Key（默认使用内置 key）</li>
 *   <li>{@code FENXI365_BASE_URL} - 服务端地址（默认 https://f3.fenxi365.com）</li>
 * </ul>
 */
class Fenxi365ClientIntegrationTest {

    private static final String BASE_URL = System.getProperty("FENXI365_BASE_URL",
            System.getenv().getOrDefault("FENXI365_BASE_URL", "https://f3.fenxi365.com"));

    private static final String API_KEY = System.getProperty("FENXI365_API_KEY",
            System.getenv().getOrDefault("FENXI365_API_KEY", "AK-YyQMPVOa7MeJpKuAiPtCDEVy3estTtvlRf5c"));

    @Test
    void testAccountSetsList() {
        Fenxi365Client client = new Fenxi365Client(BASE_URL, API_KEY);

        JsonResult<PageResult<AccountSetsDto>> result = client.accountSets().list(null, 1, 20, null);

        System.out.println("Response: " + result);
        assertNotNull(result);
        assertTrue(result.isSuccess(), "API 调用应返回成功，错误信息: " + result.getMsg());
        assertNotNull(result.getData());
        assertNotNull(result.getData().getResults());
        System.out.println("账套数量: " + result.getData().getTotal());
        for (AccountSetsDto as : result.getData().getResults()) {
            System.out.println("  - " + as.getId() + ": " + as.getCompanyName());
        }
    }

    @Test
    void testAccountSetsListWithCompanyName() {
        Fenxi365Client client = new Fenxi365Client(BASE_URL, API_KEY);

        JsonResult<PageResult<AccountSetsDto>> result = client.accountSets().list("测试公司", 1, 10, false);

        System.out.println("Response: " + result);
        assertNotNull(result);
        assertTrue(result.isSuccess(), "API 调用应返回成功，错误信息: " + result.getMsg());
    }

    @Test
    void testInvalidApiKey() {
        Fenxi365Client client = new Fenxi365Client(BASE_URL, "AK-invalid-key");

        ApiException exception = assertThrows(ApiException.class, () -> {
            client.accountSets().list(null, 1, 20, null);
        });

        int code = exception.getStatusCode();
        System.out.println("无效 key 返回: HTTP " + code + ": " + exception.getMessage());
        // 不同的服务器配置可能返回不同的状态码
        assertTrue(code >= 400 && code < 500,
                "无效 key 应返回 4xx，实际: " + code);
    }
}
