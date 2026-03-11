package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    public static void main(String[] args){
        String phone="03266676549";
        String regex="^(\\+92|92|0)3\\d{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if(matcher.find()){
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number ");
        }

    }
}
