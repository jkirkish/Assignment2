package com.coderscampus.Assignment2;

import java.util.Scanner;

public class HigherOrGuessForTest {

	public static void main(String[] args) {
		
		int guess;
		int actual;
		int tries = 0;
		HigherLowerGuessFor game = new HigherLowerGuessFor();

		game.setActualNumber();
		game.setGuess();
		actual = game.getActual();
		guess = game.getGuess();
		Scanner putGuessIn = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			tries++;
			System.out.println("attempts: " + tries);
			if (guess >= 101 || guess <= 0) {
				System.out.println("Your guess (" + guess + ") is not between 1 and 100, please try again");
				System.out.println("This attempt will not count!");
				System.out.print("Please pick a number betweeen 1 and 100:");
				guess = putGuessIn.nextInt();
				i--;
				tries--;
			} else if (actual == guess) {
				System.out.println(game.getWinningInfo() + guess);
				i=5;
				} else if (i == 4) {
				System.out.println(game.getLoseInfo());
			} else {
				if (actual > guess) {
					System.out.println("Please pick a higher number!");
					System.out.print("Please pick a number betweeen 1 and 100:");
					guess = putGuessIn.nextInt();

				} else if (actual < guess) {
					System.out.println("Please pick a lower number!");
					System.out.print("Please pick a number betweeen 1 and 100:");
					guess = putGuessIn.nextInt();

				}

			}
		}putGuessIn.close();
	}

}
