package com.osfocus.www.patterns.visitor;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        StudentVisitor student = new StudentVisitor();
        computer.accpet(student);
        System.out.println("price = " + student.totalPrice);
    }
}
