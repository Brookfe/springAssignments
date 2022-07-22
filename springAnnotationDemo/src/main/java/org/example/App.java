package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student theStudent = context.getBean(Student.class);
        theStudent.setId(1);
        theStudent.setName("Name");
        
        System.out.println( theStudent );

        context.close();
    }
}
