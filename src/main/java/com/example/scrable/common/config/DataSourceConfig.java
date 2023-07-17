package com.example.scrable.common.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.username}")
    private String userName;

    @Value("${datasource.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        return setDataSource();
    }
    private DataSource setDataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(this.url);
        hikariDataSource.setUsername(this.userName);
        hikariDataSource.setPassword(this.password);
        return hikariDataSource;
    }
}
