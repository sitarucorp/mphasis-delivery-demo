package com.mphasis.delivery.demo.backend.config;

import com.mphasis.delivery.demo.backend.handlers.LoggingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.lang.Nullable;

@EnableR2dbcRepositories(basePackages = "com.mphasis.delivery.demo.backend.repository")
@Configuration
public class BackendApplicationConfig {

    @Nullable
    LoggingInterceptor loggingInterceptor;

    BackendApplicationConfig(@Nullable LoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }
}
