package com.balram.springCoreTesting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);


        System.out.println("-------------------------------------");
        System.out.println("-----Bean Testing with properties----");
        System.out.println("-------------------------------------");
        System.out.println();
        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();


        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("-----Bean Testing with contructor----");
        System.out.println("-------------------------------------");
        System.out.println();

        Student s1 = (Student) factory.getBean("s1");
        s1.displayInfo();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("-------autowire=byname in xml-------");
        System.out.println("-------------------------------------");
        System.out.println();

        A a = (A) factory.getBean("a");
        a.display();


        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("-autowire=constructor in xml-");
        System.out.println("-------------------------------------");
        System.out.println();

        // but setting autowire=constructor for bean y1 works
        Y y1 = (Y) factory.getBean("y1");
        y1.display();

//           Using  classPathResource creates object from bean only when called spefically from beanFactory
//           but application context creates all the bean objects  when context created
//
//          @Autowired working only with application context
//


        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("-@Autowired in java configuration @Configuration-");
        System.out.println("-------------------------------------");
        System.out.println();

        ApplicationContext cntxt=new AnnotationConfigApplicationContext(Conf.class);
        Z z=cntxt.getBean(Z.class);
       z.display();

    }
}
