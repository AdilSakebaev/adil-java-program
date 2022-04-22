package com.java.class18;

import javafx.beans.binding.Bindings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        if (isPal(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean isPal(String str) {
        String reverse = "";
        int i;
        for (i = str.length() - 1; i > 0; i--) {
            reverse = reverse + (str.charAt(i));

        }
        if (str.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}


