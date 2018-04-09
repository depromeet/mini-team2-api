package com.depromeet.mini.team2.api.configuration;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@PropertySource("classpath:db.properties")
public class DataSourceConfiguration {	
	@Autowired
	Environment env;

    @Bean(destroyMethod="close")
    public DataSource dataSource() {
        return DataSourceBuilder.create()
        		.username(env.getProperty("username"))
        		.password(env.getProperty("password"))
        		.driverClassName(env.getProperty("driver-class-name"))
        		.url(env.getProperty("url"))
        		.build();
    }
    
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.depromeet.mini.team2.api.model");
        return sessionFactory;
    }
}

