package com.rest.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan(basePackages = "com.rest")
@EnableWebMvc //включение спринг-mvc
public class MyConfig implements WebMvcConfigurer {


}
