package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Margaritta City, 4220224";
        String[] words = address.split(" ");
        for (int i = 0; i <= 5; i++) {
            System.out.println(words[i]);
        }
    }
}
