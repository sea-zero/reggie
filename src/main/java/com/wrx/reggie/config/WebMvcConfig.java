package com.wrx.reggie.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 设置静态资源映射
 * 当静态文件直接放在resources下才需要启用
 * springboot环境下，静态资源放在static内则无需设置
 * @author wrx
 * @date 2022/08/04/3:52
 */
// @Slf4j
// @Configuration
// public class WebMvcConfig extends WebMvcConfigurationSupport {
//     @Override
//     protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//         log.info("开始进行静态资源映射……");
//         registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
//         registry.addResourceHandler("/front/**").addResourceLocations("classpath:/front/");
//     }
// }
