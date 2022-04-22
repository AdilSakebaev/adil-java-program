package com.java.class16;

public class StringDemo {
    public static void main(String[] args) {
        String str="Hello";


        //String buffer uses the buffer mechanism to protect data from being accessed and update and the same time, so it's
        // thread safe
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

        //String builder does not have buffer mechanism so it's faster, but no thread safe
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();

    }
}
