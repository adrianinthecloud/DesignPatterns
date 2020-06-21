package com.osfocus.www.patterns.visitor;

public class Computer {
    private ComputerPart cpu = new CPU();
    private ComputerPart memory = new Memory();
    private ComputerPart board = new Board();

    public void accpet(Visitor v) {
        cpu.accept(v);
        memory.accept(v);
        board.accept(v);
    }
}

abstract class ComputerPart {
    public abstract void accept(Visitor v);

    public abstract double getPrice();
}

class CPU extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public double getPrice() {
        return 2000.0;
    }
}

class Memory extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public double getPrice() {
        return 800.0;
    }
}

class Board extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}

class StudentVisitor implements Visitor {
    double totalPrice = 0;

    @Override
    public void visit(CPU cpu) {
        totalPrice += cpu.getPrice()*0.8;
    }

    @Override
    public void visit(Memory memory) {
        totalPrice += memory.getPrice()*0.8;
    }

    @Override
    public void visit(Board board) {
        totalPrice += board.getPrice()*0.8;
    }
}
