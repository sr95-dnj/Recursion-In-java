package com.sr;

public class CalculateFactorialOf_N {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int res = n * calculateFactorial(n - 1);
        return res;
    }
}
