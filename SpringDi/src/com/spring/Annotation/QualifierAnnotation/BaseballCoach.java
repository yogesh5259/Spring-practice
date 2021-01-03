package com.spring.Annotation.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {


    private FortuneService theFortuneService;

    // Qualifier annotation with Setter method
    @Qualifier("happyFortuneService") // id of the class in Annotation
    @Autowired
    public void setTheFortuneService(FortuneService theFortuneService) {
        System.out.println("Setter method is called...");
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getWork() {
        return "Do work!";
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
