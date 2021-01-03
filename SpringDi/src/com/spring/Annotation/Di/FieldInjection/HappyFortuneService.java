package com.spring.Annotation.Di.FieldInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String DailyFortune() {
        return "Today is your lucky day with spring Di!";
    }
}
