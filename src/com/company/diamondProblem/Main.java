package com.company.diamondProblem;

public class Main {

    public static void main(String[] args) {
    }


}




interface A {
    void method();
}

interface B {
    String method();
}

class Child_A implements A {
    @Override
    public void method() {

    }
}

class Child_B implements B {
    @Override
    public String method() {
        return null;
    }
}

class Child_Proxy {
    private Child_A child_a;
    private Child_B child_b;

    public String bMethod() {
        return child_b.method();
    }

    public void aMethod() {
        child_a.method();
    }
}