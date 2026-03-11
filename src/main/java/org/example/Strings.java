package org.example;

public class Strings {

    public static void main(String[] args) {


        // 1. Basic String Methods


        String name = "Seamless";
        String name1 = "SEAMLESS";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println("Substring (0,3): " + name.substring(0,3));

        String nonTrimmedString = "     seamless     ";
        System.out.println("Before trim: [" + nonTrimmedString + "]");
        System.out.println("After trim: [" + nonTrimmedString.trim() + "]");

        System.out.println("Replace: " + name.replace("Sea","Mea"));
        System.out.println("StartsWith 'Sea': " + name.startsWith("Sea"));
        System.out.println("Char at index 2: " + name.charAt(2));




        // 2. String Comparison


        System.out.println("Equals: " + name.equals(name1));
        System.out.println("EqualsIgnoreCase: " + name.equalsIgnoreCase(name1));



        // 3. String Immutability

        String s = "Hello";
        s.concat(" Java");

        System.out.println("String immutability: " + s);
        // Output still "Hello"




        // 4. StringBuilder (Mutable)


        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println("Append: " + sb);

        sb.insert(4," Language");
        System.out.println("Insert: " + sb);

        sb.replace(5,13,"Script");
        System.out.println("Replace: " + sb);

        sb.delete(5,11);
        System.out.println("Delete: " + sb);

        System.out.println("Reverse: " + sb.reverse());



        // 5. Reverse String using Loop

        StringBuilder str = new StringBuilder("Seamless");
        StringBuilder rev = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            rev.append(str.charAt(i));
        }

        System.out.println("Manual Reverse: " + rev);



        // 6. StringBuffer (Thread Safe)


        StringBuffer buffer = new StringBuffer("Java");
        System.out.println("The capacity of the buffer is "+ buffer.capacity());

        buffer.append(" Developer");
        System.out.println("StringBuffer Append: " + buffer);

        buffer.insert(4," Programming");
        System.out.println("StringBuffer Insert: " + buffer);

        buffer.reverse();
        System.out.println("StringBuffer Reverse: " + buffer);




        // 7. Convert StringBuilder to String


        StringBuilder obj = new StringBuilder("Backend");
        String result = obj.toString();

        System.out.println("Converted to String: " + result);




        // 8. Important String Methods


        String sentence = "Java is powerful";

        System.out.println("Contains 'Java': " + sentence.contains("Java"));
        System.out.println("Index of 'is': " + sentence.indexOf("is"));
        System.out.println("Last index of 'a': " + sentence.lastIndexOf("a"));



        // 9. Split Example

        String languages = "Java,Python,C++,Go";
        String[] arr = languages.split(",");

        for(String lang : arr){
            System.out.println("Language: " + lang);
        }

    }
}