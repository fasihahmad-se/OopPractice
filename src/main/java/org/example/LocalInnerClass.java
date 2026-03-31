package org.example;

//the concept is to create a class inside the code , then we have to create it object
// in that class
//-->to avoid complex code if class needs helper class then local inner classes
// are created

public class LocalInnerClass {

    void print(){
        class  Inner{
            void show(){
                System.out.println("Inner Class Created inside the method");
            }
        }
        Inner inner=new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass= new LocalInnerClass();
        localInnerClass.print();
    }
}
