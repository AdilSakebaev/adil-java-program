package com.java.homework;

public class OddOrEven {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }

        }
    }
}
