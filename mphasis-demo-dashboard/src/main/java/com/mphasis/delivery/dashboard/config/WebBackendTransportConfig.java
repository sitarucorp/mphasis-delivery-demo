package com.mphasis.delivery.dashboard.config;

import com.mphasis.delivery.demo.commons.model.core.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebBackendTransportConfig {

    @Value("${app.backend.url:http://localhost/}")        // FIXME
    private String backend;

    @Bean
    WebClient webClient() {
        return WebClient.builder().baseUrl(backend)
                .defaultHeader(Constants.API_KEY_HEADER_NAME, Constants.DASHBOARD_API_KEY).build();
    }
}
