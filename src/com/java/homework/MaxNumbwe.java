package com.java.homework;

import java.util.Scanner;

public class MaxNumbwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is the biggest");
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2+"is the biggest");
                if(num3>num1&&num3>num2){
                    System.out.println(num3+"is the biggest");
                }else{
                    System.out.println("They're all equal");
                }
            }
        }
    }
}