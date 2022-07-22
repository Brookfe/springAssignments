package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentSpringConfig {

    @Bean
    @Scope("singleton")
    public Student returnStudent(){
        return new Student(1);
    }


}
