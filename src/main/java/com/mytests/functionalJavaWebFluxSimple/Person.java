package com.mytests.functionalJavaWebFluxSimple;

/**
 * *
 * <p>Created by irina on 12/29/2021.</p>
 * <p>Project: functional-java-webflux-simple</p>
 * *
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
