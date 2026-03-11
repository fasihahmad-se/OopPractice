package org.example;

public class ExceptionH {
    public static void main(String[] args){
        try{
            int a=20;
            int b=0;

            int result =a/b;
        } catch (Exception e) {
            System.out.println("Error : Cant be divide by 0");
        }
    }
}
