package com.osfocus.www.patterns.visitor;

public interface Visitor {
    void visit(CPU cpu);
    void visit(Memory memory);
    void visit(Board board);
}
