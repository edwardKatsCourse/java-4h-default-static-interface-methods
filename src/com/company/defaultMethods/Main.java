package com.company.defaultMethods;

public class Main {

    public static void main(String[] args) {

	    //new Object implements MyInterface
        new MyInterface() {

            public void sayHi() {

            }
        };

    }
}

interface MyInterface {
    /*public final */ String MY_CONSTANT_VARIABLE = "";

    void sayHi();

    default Integer integerConverter(String s) {
        sayHi();
        return Integer.parseInt(s);
    }
}

class MyClass implements MyInterface {

    @Override
    public void sayHi() {
    }
//    public Integer integerConverter(String s) {
//        return Integer.parseInt(s);
//    }
}

