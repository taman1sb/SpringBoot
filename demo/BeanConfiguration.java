package com.training.spring.demo;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Gson gson() {
        return new Gson();
    }
    @Bean
    public Company company(){
        Company company = new Company();
        company.setCompanyId(101);
        company.setCompanyName("SjsdhfsjfhlBT");
        return company;
    }

}
