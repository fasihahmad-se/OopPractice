package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String text = "Java is platform independent";
        String regex = "is";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int match = 0;

        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start() + " to " + matcher.end());
            match++;
        }

        System.out.println("Total matches: " + match);
    }
}