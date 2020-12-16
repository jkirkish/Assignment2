package com.coderscampus.Assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessFor {

	private int guess, actual;

	
	HigherLowerGuessFor()
	{
		guess = 0;
		actual = 0;
		
	}
    public void setActualNumber() {
    	Random actualRan = new Random();
    	this.actual = actualRan.nextInt(100) + 1;	
    }
	public void setGuess() {
		
		Scanner putGuessIn = new Scanner(System.in);
		System.out.print("Pick a number between 1 and 100: ");
		this.guess = putGuessIn.nextInt();
	
	}
	public int getGuess() {
		
		return guess;
	}
	public String getWinningInfo() 
	{
		String s = "You win! \nActual number: " + actual + " Your guess: ";
		return s;
	}
	public int getActual() {
		
		return actual;
	}
	public String getLoseInfo() 
	{
		String message = "You lose, the number to guess was "+ actual + "\nGame over";
		return message;
	}

}

