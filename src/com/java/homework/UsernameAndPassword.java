package com.java.homework;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username and password");
        String username ="Adil";
        String password = "Sakebaev";
        if(username!="Adil"){
            System.out.println("invalid username");
        }else if (password!="Sakebaev"){
            System.out.println("invalid password");
        }else{
            System.out.println("Login successful");
        }
        }
    }

