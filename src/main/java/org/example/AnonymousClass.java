package org.example;//package org.example;
//
//public class Anonymous_Class {
//
//    void show() {
//        System.out.println("Class A");
//    }
//    //to change the method normally we have to do by this method: to overcome this we introduce
////anonymous
////     class B extends Anonymous_Class {
////
////         void show() {
////             System.out.println("Class B");
////         }
//    public static void main(String[] args) {
//
//        Anonymous_Class obj = new Anonymous_Class() {
//            void show() {
//                System.out.println("Class B");
//            }
//        };
//
//        obj.show();
//    }
//}
//
//
//
//


public class AnonymousClass {
    public static void main(String[] args) {

        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread is running using Anonymous Class");
            }
        };

        t.start();
    }
}