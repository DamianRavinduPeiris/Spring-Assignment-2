package com.damian.employeemanager.config;

import com.damian.employeemanager.endpoints.TechLeadController;
import com.damian.employeemanager.service.ProjectServiceImpl;
import com.damian.employeemanager.service.TechLeadServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableWebMvc
@Import({JPAConfiguration.class, TechLeadServiceImpl.class, ProjectServiceImpl.class})
public class WebAppRootConfig {
}
