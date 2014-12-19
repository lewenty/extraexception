package com.company.model;

import com.company.controller.ExException;

/**
 * Created by levent.yildiz on 19.12.2014.
 */
public class Person {

    private String name;
    private String lastname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ExException {
        if (age > 100) {
            throw new ExException("Yaş 100 den büyük olamaz");
        } else if (age < 18) {
            throw new ExException("Yaş 18 den küçük olamaz");
        } else {
            this.age = age;
        }
    }
}
