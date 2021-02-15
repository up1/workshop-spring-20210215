package com.example.workshop;

public class ISPDemo {
}

interface A {
    void m1();
    void m2();
}

class Process2 implements A {
    @Override
    public void m1() {
        // TODO .....
    }

    @Override
    public void m2() {
        throw new RuntimeException();
    }
}

class Process1 implements A {
    @Override
    public void m1() {
        // TODO m1
    }

    @Override
    public void m2() {
        // TODO m2
    }
}
