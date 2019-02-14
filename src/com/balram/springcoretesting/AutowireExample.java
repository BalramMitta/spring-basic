package com.balram.springcoretesting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class AutowireExample {


    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);


        /**
         * Bean testing with properties
         * getting bean defined in xml
         */
        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();


        /**
         * Bean testing with constructor args
         */

        Student s1 = (Student) factory.getBean("s1");
        s1.displayInfo();


        /**
         *  Food instance in animal is autowired by name from applicationContext
         *  animal and food is created
         */
        Animal animal = (Animal) factory.getBean("animal");
        animal.eat();


        /**
         *
         * autowiring with constructor .
         *
         * X is autowired in Y constructor without explicitly creating
         */
        Y y1 = (Y) factory.getBean("y1");
        y1.display();

//           Using  classPathResource creates object from bean only when called spefically from beanFactory
//           but application context creates all the bean objects  when context created


        /**
         *  using class file for creating beans instead of xml
         *  z instance is created as defined in Conf.class
         */
        ApplicationContext cntxt = new AnnotationConfigApplicationContext(Conf.class);


        Z z = cntxt.getBean(Z.class);
        z.display();


    }
}
