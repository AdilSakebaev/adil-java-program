package com.java.class07;

import java.util.Scanner;

public class LadderIfElseWithLogicalOperatorAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = sc.nextInt();

        if (num < 100) {
            System.out.println("no discount");
        }else if(num < 500){
            System.out.println("5%");
        }else if (num < 1000){
            System.out.println("10%");
        }else if (num>=1000){
            System.out.println("15%");
        }
    }
}
