package com.java.homework;

import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade=sc.nextInt();
        if(grade>90 && grade<100){
            System.out.println("A");
        }else if(grade>80 && grade<89){
        System.out.println("B");
        }else if (grade>70&&grade<79) {
            System.out.println("C");
        }else if (grade>60&&grade<69){
            System.out.println("D");
        }else if (grade>50&&grade<59){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
