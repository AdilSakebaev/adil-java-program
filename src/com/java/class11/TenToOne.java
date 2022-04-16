package com.java.class11;

import java.util.Scanner;

public class TenToOne {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static class WhileLoopAnalysis {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int limit = sc.nextInt();

            int i =1;

            while(i<=limit){
                System.out.println(i*5);
                  i++;
            }
        }
    }
}
