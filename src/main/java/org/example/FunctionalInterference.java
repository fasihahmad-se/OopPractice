package org.example;

interface A {
    void show();
}

public class Functional_Interference {

    public static void main(String[] args) {
// By Anonymous Class
//        A obj = new A() {
//            public void show() {
//                System.out.println("in Show");
//            }
//        };
        //Lambda Expression
        A obj = () -> {
                System.out.println("in SHOW");
        };
        obj.show();
    }
}