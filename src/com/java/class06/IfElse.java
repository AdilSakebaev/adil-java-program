package com.java.class06;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
            int num1=sc.nextInt();
            if(num1==0){
                System.out.println("Zero");
            }else if(num1>0){
                System.out.println("Positive");
            }else if(num1<0){
                System.out.println("Negative");
            }
    }
}
