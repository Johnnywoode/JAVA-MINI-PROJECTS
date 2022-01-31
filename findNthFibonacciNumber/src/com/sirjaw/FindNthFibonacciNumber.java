package com.sirjaw;

import java.math.BigInteger;
import java.util.Scanner;

public class FindNthFibonacciNumber {
    private static BigInteger[] fibonacciCache;

    public static void main(String[] args){
        System.out.print("Enter a number to find the first nth fibonacci numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        fibonacciCache = new BigInteger[number + 1];

        for (int i = 0; i <= number; i++) {
            System.out.println(i + "\t->\t" + fibonacci(i));
        }

    }

    private static BigInteger fibonacci(int number) {
        if (number <= 1)
            return BigInteger.valueOf(number);

        if (fibonacciCache[number] != null)
            return fibonacciCache[number];

        BigInteger nthFibonacciNumber = fibonacci(number - 1).add(fibonacci(number -2));
        fibonacciCache[number] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
