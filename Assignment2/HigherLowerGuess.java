package com.coderscampus.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuess {

	public static void main(String[] args) {

		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;
		int attempts = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("attempts: " + attempts);
		System.out.print("Pick a number between 1 and 100: ");
		int guess = input.nextInt();

		while (attempts < 4) {
			System.out.println("attempts: " + attempts);
			if (guess >= 101 || guess <= 0) {
				System.out.println("Your guess (" + guess + ") is not between 1 and 100, please try again");
				System.out.println("This attempt will not count!");
				System.out.print("Please pick a number betweeen 1 and 100:");
				guess = input.nextInt();

			} else if (randomNumber > guess) {
				attempts++;
				System.out.println("Please pick a higher number!");
				System.out.print("Please pick a number betweeen 1 and 100:");
				guess = input.nextInt();

			} else if (randomNumber < guess) {
				attempts++;
				System.out.println("Please pick a lower number!");
				System.out.print("Please pick a number betweeen 1 and 100:");
				guess = input.nextInt();
			} else {
				System.out.println("You win!");
				System.out.println("Actual number: " + randomNumber + " Your guess: " + guess);
				break;

			}
			if (attempts == 4) {
				System.out.println("You lose, the number to guess was " + randomNumber);
				System.out.println("Game over" + "");

			}
		}
		input.close();
	}

}
