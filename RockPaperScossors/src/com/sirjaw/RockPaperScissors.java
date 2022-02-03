package com.sirjaw;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;
            while (true) {
                System.out.print("Enter your move (r, p, or s): ");
                playerMove = input.nextLine().toLowerCase();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }
            System.out.println("Computer's move: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Yhe game is a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("you lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("you win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("you win!");
                } else if (computerMove.equals("s")) {
                    System.out.println("you lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("you lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("you win!");
                }
            }

            System.out.print("Play again? (y/n)");
            String playAgain = input.nextLine();
            if (!playAgain.equals("y")){
                break;
            }
            input.close();
        }
    }
}
