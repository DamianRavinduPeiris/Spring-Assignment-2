package com.damian.employeemanager.config;

import com.damian.employeemanager.advisor.ApplicationAdvisor;
import com.damian.employeemanager.response.Response;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {Response.class, ApplicationAdvisor.class})
@EnableWebMvc
public class WebAppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
