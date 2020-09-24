package com.example.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//虚拟地址映射，为了访问头像保存的地址
@Configuration
public class UploadConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //映射图片保存地址
        registry.addResourceHandler("/upload/**").addResourceLocations("file:D:\\实验室工程相关\\实习\\XXXX班级实训成果物\\01.各小组成果物\\第01组-组名\\03.项目代码\\01.源代码\\ourproject-server\\src\\main\\resources\\static\\");
    }
}

