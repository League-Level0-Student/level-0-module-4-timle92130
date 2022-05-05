package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_Scores {
public static void main(String[] args) {
	

	
		String testScore = JOptionPane.showInputDialog(null, "what did u get on your test?");
		double score = Double.parseDouble(testScore);
		if (score<85) {
			System.out.println("you need to study more");
		}
		else {
			System.out.println("good job!!!!");
		}
		System.out.println(score);

	
}
}