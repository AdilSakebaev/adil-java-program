package com.java.class17;

public class MethodExample2 {

    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }



    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i+"even");
            }else{
                System.out.println(i+"odd");
            }
        }
    }
}
