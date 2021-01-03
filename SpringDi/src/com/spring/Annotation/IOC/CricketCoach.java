package com.spring.Annotation.IOC;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public String getWork(){
        return "Do batting for 20 minutes!";
    }

}
