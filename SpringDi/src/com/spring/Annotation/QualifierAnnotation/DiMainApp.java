package com.spring.Annotation.QualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMainApp {

    public static void main(String[] args) {
        //Load config file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        //get the bean form the container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //Call the method on bean
        System.out.println(theCoach.getWork());
        System.out.println(theCoach.getFortune());

    }

}
