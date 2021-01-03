package com.spring.xml.DI.setterInjection;

public class CricketCoach implements Coach {

    private String nameOfCoach;
    private double conatctNumber;
    private FortuneService theFortuneService;

    public void setTheFortuneService(FortuneService theFortuneService) {
        System.out.println("\nSetter method is called!");
        this.theFortuneService = theFortuneService;
    }

    public void setNameOfCoach(String nameOfCoach) {
        System.out.println("Calling setter for name of coach!\n");
        this.nameOfCoach = nameOfCoach;
    }

    public void setConatctNumber(double conatctNumber) {
        System.out.println("Calling the setter for mobile number");
        this.conatctNumber = conatctNumber;
    }

    @Override
    public String getWork(){
        return "Do batting for 20 minutes! "  + nameOfCoach + " " + conatctNumber;
    }

    @Override
    public String getFortune() {
        return theFortuneService.DailyFortune();
    }
}
