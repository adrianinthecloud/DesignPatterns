package com.osfocus.www.patterns.prototype;


public class Student implements Cloneable {
    private String name;
    private int age;
    private UniClass uniClass;

    public Student(String name, int age, UniClass uniClass) {
        this.name = name;
        this.age = age;
        this.uniClass = uniClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UniClass getUniClass() {
        return uniClass;
    }

    public void setUniClass(UniClass uniClass) {
        this.uniClass = uniClass;
    }

    @Override
    public Object clone() {
        try {
            Student student = (Student) super.clone();
            student.uniClass = (UniClass) student.uniClass.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", uniClass=" + uniClass +
                '}';
    }
}
