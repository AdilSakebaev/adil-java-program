package com.java.homework;

public class Class16HW3 {
    public static void main(String[] args) {
        int num=0;
        for(int i=1; i<=10; i++){
            if(i%3==0){
                num=num-i;
            }else{
                num=num+i;
            }
        }
        System.out.println(num);
    }
}
