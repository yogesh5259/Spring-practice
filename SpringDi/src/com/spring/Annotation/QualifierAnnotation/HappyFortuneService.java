package com.spring.Annotation.QualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String DailyFortune() {
        return "Today is your lucky day with spring Di!";
    }
}
