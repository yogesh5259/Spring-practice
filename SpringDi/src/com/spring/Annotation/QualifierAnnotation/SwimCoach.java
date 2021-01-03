package com.spring.Annotation.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    @Qualifier("happyFortuneService")
    @Autowired
    private FortuneService theFortuneService;

    @Override
    public String getWork() {
        return "Do swimming!..";
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
