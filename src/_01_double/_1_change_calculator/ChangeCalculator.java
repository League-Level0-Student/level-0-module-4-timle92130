package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog(null, "how many pennies do you have");
		int x = Integer.parseInt(n);
		int y = (int) (x*0.01);
		String a = JOptionPane.showInputDialog(null, "how many nickels do you have");
		int b = Integer.parseInt(a);
		int c = (int) (b*0.05);
		String h = JOptionPane.showInputDialog(null, "how many dimes do you have");
		int g = Integer.parseInt(h);
		int l = (int) (g*0.05);
		String v = JOptionPane.showInputDialog(null, "how many quarters do you have");
		int s = Integer.parseInt(v);
		int m = (int) (s*0.05);

		System.out.println(y + c + l + m);
		
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		
		// Ask the user how many dimes they have, and convert their answer
		
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

