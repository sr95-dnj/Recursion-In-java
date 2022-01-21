package com.sr;

public class FabonacciSeries {

    public static long[] fibonacciCache;

    public static void main(String[] args) {
        // first way
        int n = 9;
        for(int j = 0; j <= n; j++){
            System.out.print(fabonacci(j) + " ");
        }
        System.out.println("");
        System.out.println("2nd way.................");

        // 2nd way
        int nn = 92;
        fibonacciCache = new long[nn + 1];
        for(int i = 0; i<= nn; i++){
            System.out.print(fabonacci2ndWay(i) + " ");
        }

    }

    // first way
    private static long fabonacci(int n) {

        if(n <=1){
            return n;
        }
        long num = fabonacci(n - 1) + fabonacci(n - 2);
        return num;
    }

    // 2nd way
    private static long fabonacci2ndWay(int n) {
        if(n <=1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long num = (fabonacci2ndWay(n - 1) + fabonacci2ndWay(n - 2));
        fibonacciCache[n] = num;

        return num;
    }
}
