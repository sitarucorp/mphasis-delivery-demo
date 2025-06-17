package com.mphasis.delivery.demo.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories(basePackages = "com.mphasis.delivery.demo.backend.repository")
@Configuration
public class BackendApplicationConfig {

}
