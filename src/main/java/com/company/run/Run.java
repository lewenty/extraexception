package com.company.run;

import com.company.controller.ExException;
import com.company.model.Person;

/**
 * Created by levent.yildiz on 19.12.2014.
 */
public class Run {

    public static void main(String[] args) throws ExException {

        Person person = new Person();
        person.setName("Levent");
        person.setLastname("YILDIZ");
        person.setAge(150);


    }

}
