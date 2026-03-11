package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Box<T>{
       T value;
       void setValue(T value){
           this.value=value;
       }
       T getValue(){
           return value;
       }
}

class Box1<K,T>{
    T value1;
    K value2;

    void setValue1(T value1){
        this.value1=value1;
    }
    void setValue2(K value2){
        this.value2=value2;
    }
    T getValue1(){
        return value1;
    }
    K getValue2(){
        return value2;
    }

}
public class Generics {
    public static void main(String[] args) {
//        Single type generics
        Box<String> box=new Box<>();
        Scanner sc=new Scanner(System.in);
        box.setValue("Hello");
        System.out.println( box.getValue());

//   Multiple type generics:String
        Box1<String,Integer> box1=new Box1<>();
        box1.setValue1(43);
        box1.setValue2("Seamless");
        System.out.println(box1.getValue1()+" "+ box1.getValue2());
//        ArrayList l= new ArrayList();
        //if we want to restrict that only string will add to array list we make it generic
        ArrayList<String> l=new ArrayList<String>();
        l.add("fasih");
        l.add("Seamless");
//        l.add(43);// compiler error
        System.out.println(l);


    }
}
