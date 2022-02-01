package com.sirjaw;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MortgageCalculator {

    private static final int MONTHS_IN_A_YEAR = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the principal amount: ");
            double principal = input.nextDouble();

            System.out.print("Enter the annual interest rate: ");
            float annualInterestRate = input.nextFloat();

            System.out.print("Enter the term in years: ");
            int termInYears = input.nextInt();

            input.close();

            float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
            int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;

            double monthlyPayment = principal * (
                    (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                            ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1)
            );

            System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
            System.out.println("Total payback amount: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Enter valid values for the inputs");
        }
    }
}
