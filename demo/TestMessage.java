package com.training.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class TestMessage {

    public void message(String str){

        System.out.println("Hi"+ str);
    }
}
