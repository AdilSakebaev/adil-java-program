package com.java.homework;

import java.util.Scanner;

public class TshirtSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size>27&&size<30){
            System.out.println("XS");
        }else if(size>31&&size<34){
            System.out.println("S");
        }else if(size>35&&size<38){
            System.out.println("L");
        }else if (size>39&&size<42){
            System.out.println("XL");
        }else if (size>45&&size<50){
            System.out.println("XXL");
    }else{
            System.out.println("Too big of a number");
        }
    }
}
