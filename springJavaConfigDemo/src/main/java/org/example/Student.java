package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;



    public Student(){};
    public Student( Address a ) {
        this.add = a;
    }
    public Student( int i ) { this.id = i;};


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }


}
