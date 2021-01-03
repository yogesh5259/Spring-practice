package com.spring.xml.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCMainApp {

    public static void main(String[] args) {
        //Load config file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean form the container
        Coach theCoach = context.getBean("cricketCoach",Coach.class);

        //Call the method on bean
        System.out.println(theCoach.getWork());
    }

}
