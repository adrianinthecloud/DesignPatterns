package com.osfocus.www.patterns.builder;

/***
 * Author: Adrian LIU
 * Date: 2020-06-15
 * Builder Patter can be used to construct a complex object step by step
 * It is also good for avoiding bugs while putting in more than 3 parameters in constructors
 */
public class BuilderTester {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                            .name("Adrian")
                            .age(18)
                            .email("test@test.com")
                            .phone("12345678")
                            .location("Sydney NSW 2000")
                            .build();
        System.out.println("Person = " + p);
    }
}
