package com.atguigu.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * Ceaate by 76819 on 2021/4/20
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig {
    @Bean
    public HiddenHttpMethodFilter help(){
        HiddenHttpMethodFilter hpmf = new HiddenHttpMethodFilter();
        hpmf.setMethodParam("_m");
        return hpmf;
    }
}
