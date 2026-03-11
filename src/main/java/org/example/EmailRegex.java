package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static void main(String[] args) {
        String gmail = "fasih.ahmad@gmail.com";
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@gmail\\.com$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gmail);

        if (matcher.find()) {
            System.out.println("is Valid Email");
        } else {
            System.out.println("Not Valid");
        }
    }
}

