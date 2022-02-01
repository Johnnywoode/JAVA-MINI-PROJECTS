package com.sirjaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your limit for prime numbers (eg. 100): ");

        Integer limit = input.nextInt();

        for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2 ; factor++) {
                if (numberToCheck%factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(numberToCheck);
            }
        }

        System.out.print("The prime numbers between 0 and " + limit + " are: \n{ ");
        primeNumbers.forEach(primeNumber ->{
            System.out.print(primeNumber+ " ");
        });
        System.out.print("}");
    }
}
