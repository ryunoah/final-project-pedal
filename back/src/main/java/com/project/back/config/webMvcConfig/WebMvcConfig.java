package com.project.back.config.webMvcConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  
public class WebMvcConfig implements WebMvcConfigurer {  

    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
        registry.addResourceHandler("/images/**") 
        .addResourceLocations("file:///Users/gimjieun/Desktop/final-project-pedal/back/src/main/resources/static/images/"); // 정적 리소스가 위치한 디렉토리 경로
    }  
}