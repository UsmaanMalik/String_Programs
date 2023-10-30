package Strings;

import java.lang.String;

public class StringsOperation {
    public static void main(String[] args) {
        // How can you find the length of a string in Java
        String myStringg = "Hello, World!";
        int length = myStringg.length();
        System.out.println("Length of the string: " + length);

        System.out.println("=====================concatenate two strings===========================");

        String str1 = "Hello ";
        String str2 = "World";
        String result = str1 + str2;
        System.out.println(result);

        System.out.println("=====================difference between equals() " == "============================");

        // Solution:
        // The equals() method checks if the content of two strings is equal.
        // The == operator checks if the references to the two string objects are the

        // String str3 = "Usman";
        // String str4 = "Malik";
        // boolean isEqual = str3.equals(str4);
        // boolean isSameReference = str3 == str4;
        System.out.println("===================================================");
        // How do you convert a string to uppercase and lowercase in Java");

        String myString = "Hello, World!";
        String uppercase = myString.toUpperCase();
        String lowercase = myString.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        System.out.println("===================================================");

        // How do you compare two strings for equality in Java
        // String strr = "Hello";
        // String strr2 = "World";
        // boolean isEqual = strr.equals(strr2);
        // System.out.println(isEqual);

        System.out.println("========================================================");

        // Explain the concept of string immutability in Java
        String original = "Hello";
        String modified = original.concat(", myString");
        System.out.println(modified);

        System.out.println("============================================================");
        // What is the charAt() method, and how is it used to retrieve a character from
        // a string?

        String text = "java";
        char firstChar = text.charAt(2);
        System.out.println(firstChar);
        System.out.println("=======================================");
        // How do you check if a string contains a specific substring in Java?
        // String sentence = "this is a test sentence";
        // boolean containsWord = sentence.contains("Malik");
        // System.out.println(containsWord);

        System.out.println("================================================");
        // What is the substring() method used for in Java strings
        String text1 = "Heelo, World";
        String subString = text.substring(7);
        System.out.println(subString); 

        System.out.println("========================================================");
        //How can you replace characters or substrings within a string in Java using the replace() method
        String sen ="I like cats, but i prefer dogs";
        String replaced=sen.replace("cats", "dogs");
        System.out.println(replaced);

    }

}
