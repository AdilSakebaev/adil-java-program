package com.java.class13;

import java.util.Scanner;

public class StringEX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1="Hello";
        String str2=sc.nextLine();
        if(str1==str2){
            System.out.println("true");
        }else{
            System.out.println("false");
            //When we compare two strings with '==' it will compare its memory location
            //When we compare two strings with '.equals' it will compare its data
        }

    }
}
