package com.sr;

public class Print_1_5 {
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }

    public static void printNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
}
