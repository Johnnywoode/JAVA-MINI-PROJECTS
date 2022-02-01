package com.sirjaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static final int MAX_NUMBER = 49;
    public static void main(String[] args) {
        List<Integer> winningNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            while (true) {
                int winningNumber = random.nextInt(MAX_NUMBER) + 1;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }

        System.out.print("Enter your 6 numbers between 1 and "+ MAX_NUMBER + ": ");
        Scanner input = new Scanner(System.in);

        List<Integer> guessedNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if(guessedNumbers.size() != 0) {
                System.out.println("Your current numbers are " + guessedNumbers);
                System.out.print("Enter your next number (1-" + MAX_NUMBER + "): ");
            }
            while (true){
                try {
                    int number = Integer.parseInt(input.nextLine());
                    if (number > 0 && number <= MAX_NUMBER) {
                        guessedNumbers.add(number);
                        break;
                    } else {
                        System.out.println(number + " is not between 1 and 49. Please try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("Sorry, that is not a number. Please try again");
                }
            }
        }

        System.out.println("The winning numbers were: " + winningNumbers);
        System.out.println("Your numbers are: " + guessedNumbers);
        guessedNumbers.retainAll(winningNumbers);
        System.out.println("Your matched numbers are: " + guessedNumbers);

        if (guessedNumbers.containsAll(winningNumbers)){
            System.out.println("Hurray you won!!!");
        }else{
            System.out.println("Oops, you lost. Better luck next time");
        }
    }
}
