package com.fenxi365.openapi.client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApiExceptionTest {

    @Test
    void testApiException() {
        ApiException ex = new ApiException(401, "Unauthorized");
        assertEquals(401, ex.getStatusCode());
        assertEquals("Unauthorized", ex.getMessage());
    }
}
