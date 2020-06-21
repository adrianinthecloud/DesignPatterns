package com.osfocus.www.patterns.builder;

public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String location;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private Person p = new Person();

        public PersonBuilder name(String name) {
            p.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            p.age = age;
            return this;
        }

        public PersonBuilder email(String email) {
            p.email = email;
            return this;
        }

        public PersonBuilder phone(String phone) {
            p.phone = phone;
            return this;
        }

        public PersonBuilder location(String location) {
            p.location = location;
            return this;
        }

        public Person build() {
            return p;
        }
    }
}
