package com.mortal.springCar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
/**
* Hello world!
*
*/
public class App {
    public static void main(String[] args) {
        System.out.println("**************Using ApplicationContext:**************\n");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            Car car1 = (Car) context.getBean("car1");
            System.out.println(car1.toString() + "\n\n");
        } finally {
            // Close the ApplicationContext to release resources
            if (context instanceof ClassPathXmlApplicationContext) {
                ((ClassPathXmlApplicationContext) context).close();
            }
        }

        System.out.println("************Using BeanFactory:****************\n");
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            Car car2 = (Car) factory.getBean("car2");
            System.out.println(car2.toString());
        } finally {
            if (factory instanceof ClassPathXmlApplicationContext) {
                ((ClassPathXmlApplicationContext) factory).close();
            }
        }
    }
}
