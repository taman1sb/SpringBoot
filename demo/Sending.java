package com.training.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Sending {

    private TestMessage testMessage;

// Sending (@Autowired TestMessage testMessage){
//     this.testMessage=testMessage;
// }

    @PostConstruct
    public void text() {

        testMessage.message("Shankerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
@Autowired
    public void setTestMessage(TestMessage testMessage) {
        this.testMessage = testMessage;
    }
}
