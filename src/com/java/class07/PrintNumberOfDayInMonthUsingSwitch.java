package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a month: ");
        String month = sc.nextLine();

        switch(month){
            case "january":
                System.out.println(31);
                break;
            case "february":
                System.out.println(31);
                break;
            case "march":
                System.out.println(31);
                break;
            case "april":
                System.out.println(28);
                break;
            case "may":
                System.out.println(31);
                break;
            case "june":
                System.out.println(31);
                break;
            case "july":
                System.out.println(30);
                break;
            case "august":
                System.out.println(31);
                break;
            case "september":
                System.out.println(31);
                break;
            case "october":
                System.out.println(30);
                break;
            case "november":
                System.out.println(29);
                break;
            case "december":
                System.out.println(31);
        }
    }
}

