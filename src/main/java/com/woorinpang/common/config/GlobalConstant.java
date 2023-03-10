package com.woorinpang.common.config;

public interface GlobalConstant {

    final String HEADER_SITE_ID = "X-Site-Id"; //header 에 어떤 사이트에서 보내는 요청인지 구분하기 위한 정보
    final String AUTHORIZATION_URI = "/api/v1/authorizations/check";
    final String REFRESH_TOKEN_URI = "/api/v1/users/token/refresh";
    final String MESSAGES_URI = "/api/v1/messages/**";
    final String LOGIN_URI = "/login";
    final String[] SECURITY_PERMITAIL_ANTPATTERNS = {AUTHORIZATION_URI, REFRESH_TOKEN_URI, MESSAGES_URI, LOGIN_URI, "/actuator/**", "/v3/api-docs/**", "/api/v1/images/**", "/swagger-ui.html"};
    final String USER_SERVICE_URI = "/user-service";
}
