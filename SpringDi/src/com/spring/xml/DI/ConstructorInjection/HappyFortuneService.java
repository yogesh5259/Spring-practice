package com.spring.xml.DI.ConstructorInjection;

public class HappyFortuneService implements FortuneService {
    @Override
    public String DailyFortune() {
        return "Today is your lucky day with spring Di!";
    }
}
