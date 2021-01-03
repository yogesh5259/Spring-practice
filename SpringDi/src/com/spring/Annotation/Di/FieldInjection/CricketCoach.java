package com.spring.Annotation.Di.FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    //Injecting literal value for property file
    @Value("${CricketCoach.name}")
    private String coachName;

    //Injecting Dependency using @Autowired Annotation
    @Autowired
    private FortuneService theFortuneService;


    @Override
    public String getWork(){
        return "Do batting for 20 minutes! " + coachName;
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
