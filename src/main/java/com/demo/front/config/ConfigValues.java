package com.demo.front.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
@Getter
public class ConfigValues {
    
    @Value("${name.service}")
    private String nameService;
    
}
