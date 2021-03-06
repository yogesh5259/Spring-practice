package com.spring.Annotation.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Value("${CricketCoach.name}")
    private String coachName;

    private FortuneService theFortuneService;

    public CricketCoach(){

    }

    //Qualifier Annotation for Constructor
    @Autowired
    public CricketCoach(@Qualifier("sadFortuneService") FortuneService theFortuneService){
        System.out.println("\nConstructor is called\n");
        this.theFortuneService = theFortuneService;
    }


    @Override
    public String getWork(){
        return "Do batting for 20 minutes! " + coachName;
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
