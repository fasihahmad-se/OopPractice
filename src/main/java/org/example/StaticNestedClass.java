package org.example;

public class StaticNestedClass {
    class PaymentService{

        static class PaymentUtils{
            static void display(){
                System.out.println("Payment Utility Method");
            }
        }
    }
 //if we declare class static there is no need to create the object so we can directly
 // call a method
    public static void main(String[] args) {
        PaymentService.PaymentUtils.display();
    }
}
