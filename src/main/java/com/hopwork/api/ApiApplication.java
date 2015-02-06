
package com.hopwork.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApiApplication.class, args);
    }
}
