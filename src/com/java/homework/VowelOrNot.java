package com.java.homework;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        switch(letter){
            case"a":
            case"e":
            case"i":
            case"o":
            case"u":
                System.out.println("vowel");
                break;
            default:
                System.out.println("not vowel");
        }
    }
}





