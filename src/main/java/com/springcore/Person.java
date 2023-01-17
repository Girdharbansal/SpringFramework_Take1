package com.springcore;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    private List<String> lst;

    public Person(String name, int personId, Certi certi, List<String> lst) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.lst = lst;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                ", lst=" + lst +
                '}';
    }
}
