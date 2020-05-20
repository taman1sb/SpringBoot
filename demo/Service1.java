package com.training.spring.demo;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Service1 {

    @Autowired
    private Gson gson;
    @Autowired
    private Company company;
    @PostConstruct
    public void method1(){

        //Company company = new Company();
//        company.setCompanyId(101);
//        company.setCompanyName("SBT");

        System.out.println(gson.toJson(company));
    }




}
