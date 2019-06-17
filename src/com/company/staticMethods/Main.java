package com.company.staticMethods;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            new A();
            //1, error
        } catch (Throwable e) { //Error
            System.out.println("static block error");
        }

        //Class Loader

        Thread.sleep(100); //ниче не делает 100 милисекунд
        System.out.println("------------");

        try {
            new A(); // static block??? constructor???
        } catch (Throwable e) {
            System.out.println(e);
        }

        System.out.println("------------");
        Thread.sleep(100);

        A.method();
//        Person p1 = new Person();
//        p1.setName("Peter");
//        System.out.println("p1 -> " + p1);
//
//        Person p2 = new Person();
//        System.out.println(p2.getName());
//        System.out.println("p2 -> " + p2.toString());
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(new Person().toString());
//        }
//        new Person().setName(null);
//        for (int i = 0; i < 1_000_000; i++) {
//            System.out.println(new Person().toString());
//        }
//
//        Person p3 = new Person();
//        p3.setName("Marry");
//        System.out.println("p3 -> " + p3);
//
//
//        Person p4 = new Person();
//        System.out.println("p4 -> " + p4);
    }
}
class Person {
    private static String name;

    public static void setName(String name) {
        Person.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name : " + name;
    }
}
class A {
    static {
        System.out.println("1. static block (static constructor)");
        if (true) { throw new RuntimeException(); }
    }
    public A() {
        System.out.println("2. regular constructor");
    }
    public static void method() {
        System.out.println("3. method");
    }
}

interface MyInterface {

    void version_1();
    default void version_2() {
    }

    default void version_3() {
    }

    static Integer integerConverter(String s) {
        return Integer.parseInt(s);
    }
}

class MyClass implements MyInterface {

    @Override
    public void version_1() {
    }
}