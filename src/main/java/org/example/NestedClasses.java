package org.example;

//public class NestedClasses {
//
//    String serviceName = "UserManagement";
//
//    // First Inner Class Example
//    class User {
//        void display() {
//            System.out.println("Service name: " + serviceName);
//            System.out.println("User Created Successfully");
//        }
//    }


import java.util.Scanner;

class AuthService {

      String serviceName = "Authentication System";

      // Inner Class
      class LoginValidator {

          void isValidate(String user, String password) {
              if (user.equals("admin") && password.equals("123")) {
                  System.out.println(serviceName + " Login Successful");
              } else {
                  System.out.println("Login Failed : Enter Correct Credentials");
              }
          }
      }

      public static void main(String[] args) {

          //First Example
//          OuterClass outerObject = new OuterClass();
//          OuterClass.InnerClass innerObject = outerObject.new InnerClass();
//          NestedClasses nestedClasses = new NestedClasses();
//          NestedClasses.User user = nestedClasses.new User();
//          user.display();

        AuthService authService = new AuthService();
        AuthService.LoginValidator loginValidator = authService.new LoginValidator();
        String name; String password;

          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the user name :");
          name= scanner.nextLine();

          System.out.println("Enter the password :");
          password= scanner.nextLine();
        loginValidator.isValidate(name, password);
      }
  }



