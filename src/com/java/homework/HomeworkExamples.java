package com.java.homework;

import java.util.Scanner;

public class HomeworkExamples {
    public static void main(String[] args) {
        System.out.println("Please enter a compy name to check its owner");
        Scanner sc = new Scanner(System.in);
        String companyName = sc.nextLine();

        switch (companyName) {
            case "gmail":
            case "youtube":
            case "hangout":
                System.out.println("Google");
                break;
            case "whats app":
                System.out.println("Facebook");
                break;
            case "skype":
            case "outlook":
                System.out.println("Microsoft");
            default:
        }
    }
}



