package com.java.homework;

import java.util.Scanner;

public class Class11Homework2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");

        int limit=sc.nextInt();
        int i=1;

        while(i<=limit){
            if(i%3==0 && i%5==0){
                System.out.println(i);

            }
            i++;
        }
    }
}
