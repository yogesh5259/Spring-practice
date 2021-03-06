package com.spring.xml.DI.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMainApp {

    public static void main(String[] args) {
        //Load config file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDiConst.xml");

        //get the bean form the container
        Coach theCoach = context.getBean("cricketCoach", Coach.class);

        //Call the method on bean
        System.out.println(theCoach.getWork());
        System.out.println(theCoach.getFortune());

    }

}
