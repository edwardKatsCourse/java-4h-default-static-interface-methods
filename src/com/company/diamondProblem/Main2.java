package com.company.diamondProblem;

public class Main2 {

    public static void main(String[] args) {
        GeneralChild generalChild = new GeneralChild();
        generalChild.method();
    }
}

interface First {
    default void method() {
        System.out.println("First method");
    }
}
interface Second {
    static void method() {
        System.out.println("Second method");
    }
}

class Parent {
    public void method() {
        System.out.println("Parent method");
    }
}

class GeneralChild extends Parent implements First, Second {

    @Override
    public void method() {
        System.out.println("GeneralChild method");
        super.method();
        First.super.method();
        Second.method();
    }
}
