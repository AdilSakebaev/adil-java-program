package com.java.class13;

import java.util.Locale;

public class StringConcatenationAssignment {
    public static void main(String[] args) {
        String str="Hello";
        int num1=10;
        int num2=20;
        System.out.println(str+(num1+num2));
        System.out.println(str.toLowerCase(Locale.ROOT));
    }
}
