package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String penniesAnswer = JOptionPane.showInputDialog(null, "how many pennies do you have");
		int pennies = Integer.parseInt(penniesAnswer);
		double penniesValue = (pennies*0.01);
		String nickelAnswer = JOptionPane.showInputDialog(null, "how many nickels do you have");
		int nickels = Integer.parseInt(nickelAnswer);
		double nickelsValue = (nickels*0.05);
		String dimesAnswer = JOptionPane.showInputDialog(null, "how many dimes do you have");
		int dimes = Integer.parseInt(dimesAnswer);
		double dimesValue = (dimes*0.1);
		String quartersAnswers = JOptionPane.showInputDialog(null, "how many quarters do you have");
		int quarters = Integer.parseInt(quartersAnswers);
		double quartersValue = (quarters*0.25);
		double total = (penniesValue + dimesValue + nickelsValue + quartersValue);
		System.out.println(total);
		
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		
		// Ask the user how many dimes they have, and convert their answer
		
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

