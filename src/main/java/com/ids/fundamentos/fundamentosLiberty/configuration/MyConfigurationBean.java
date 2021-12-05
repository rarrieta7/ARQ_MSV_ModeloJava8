package com.ids.fundamentos.fundamentosLiberty.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ids.fundamentos.fundamentosLiberty.bean.MyBean;
import com.ids.fundamentos.fundamentosLiberty.bean.MyBeanImpl;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImpl();
    }
}
