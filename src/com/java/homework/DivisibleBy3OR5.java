package com.java.homework;

import java.util.Scanner;

public class DivisibleBy3OR5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num%3==0 || num%5==0) {
            System.out.println("the number divisible by 3 or 5");
        }else{
            System.out.println("not divisible");
        }
    }
}
