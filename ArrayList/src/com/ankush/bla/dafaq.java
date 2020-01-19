package com.ankush.bla;

public class dafaq {
    public static void main(String[] args) {
        A a = new B();
        A.asdf();
    }
}

class A {
    public static void asdf() {
        System.out.println("Jai Mata Di");
    }
}

class B extends A {
    public static void asdf() {
        System.out.println("Jai Mata Di2");
    }
}
