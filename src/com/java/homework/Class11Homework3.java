package com.java.homework;

import java.util.Scanner;

public class Class11Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i=1;

        while(i<=limit){
            if(i%3!=0 && i%7==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
