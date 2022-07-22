package org.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mob;


    public Phone(){};

    public Phone(String m) {
        this.mob = m;
    }


    public void setMob(String mob) {
        this.mob = mob;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
