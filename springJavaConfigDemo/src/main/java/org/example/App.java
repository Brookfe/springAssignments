package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StudentSpringConfig.class);

        Student theStudent = context.getBean( Student.class );

//        Student student = context.getBean(Student.class);

        System.out.println( theStudent );
//        System.out.println( student );

        context.close();
    }
}
