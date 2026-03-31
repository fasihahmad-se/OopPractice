package org.example;

public class Singleton {
 private static Singleton obj =new Singleton();
     Singleton() {
        System.out.println("Singleton Object Created");
    }
    public static synchronized Singleton getInstance(){
         return obj;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.obj.getInstance();
        Singleton s2 = Singleton.obj.getInstance();
        System.out.println(s1 == s2);
    }
}