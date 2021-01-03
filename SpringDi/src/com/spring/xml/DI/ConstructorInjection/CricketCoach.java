package com.spring.xml.DI.ConstructorInjection;

public class CricketCoach implements Coach {

    private FortuneService theFortuneService;
    private int mobileNumber;
    private String coachName;

    public CricketCoach(){

    }

    public CricketCoach(FortuneService theFortuneService, int mobileNumber, String coachName){
        System.out.println("\nConstructor is called\n");
        this.theFortuneService = theFortuneService;
        this.coachName = coachName;
        this.mobileNumber = mobileNumber;
    }


    @Override
    public String getWork(){
        return "Do batting for 20 minutes! "+ coachName + " " + mobileNumber;
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
