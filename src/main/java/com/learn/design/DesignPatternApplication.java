package com.learn.design;

import com.learn.design.objectpool.jdbc.DataSourceEndpoint;
import com.learn.design.objectpool.jdbc.MyDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.xml.ws.Endpoint;

/**
 * 设计模式学习
 * @author YJ WANG
 * @version 1.0
 *  Created on :2021/10/12 10:55
 */
@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(DesignPatternApplication.class, args);
    }

    @Bean
    @Primary
    public MyDataSource dataSource() {
        return new MyDataSource();
    }

    @Bean
    //@Primary
    public DataSourceEndpoint endpoint() {
        return new DataSourceEndpoint(this.dataSource());
    }
}
