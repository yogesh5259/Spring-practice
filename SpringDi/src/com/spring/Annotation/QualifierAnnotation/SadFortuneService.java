package com.spring.Annotation.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class SadFortuneService implements FortuneService{
    @Override
    public String DailyFortune() {
        return "Today is your day!";
    }
}
