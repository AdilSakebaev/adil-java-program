package com.java.class16;

import java.util.Locale;
import java.util.Scanner;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char c ='a';
        int count =0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.print(count);
           }
       }


