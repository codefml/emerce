package com.yj.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:databasesource.properties")
public class DataSourceConfiguation {

    private Logger logger= LoggerFactory.getLogger(DataSourceConfiguation.class);

   @Bean(name="dataSource")
   @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource createDataSource(){
        logger.info("create data source");
        return DataSourceBuilder.create().build();
    }


}




