package com.osfocus.www.patterns.prototype;

public class PrototypeTester {
    public static void main(String[] args) {
        UniClass uniClass = new UniClass("Computer Science");
        Student student1 = new Student("Adrian", 18, uniClass);
        Student student2 = (Student) student1.clone();

        System.out.println("student == student2: " + (student1 == student2));

        System.out.println("Student1.toString() = " + student1);

        System.out.println("Student2.toString() = " + student2);
    }
}
