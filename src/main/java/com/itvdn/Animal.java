package com.itvdn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {
    @Id
    private int id;
    private String name;

    public Animal(int id, String name, int age, boolean tail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    private int age;
    private boolean tail;


    public Animal() {

    }
}
