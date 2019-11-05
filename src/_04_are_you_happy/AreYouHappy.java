package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you happy?(Yes/No)");
	if(answer.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}else {
		answer = JOptionPane.showInputDialog("Do you want to be happy?(Yes/No)");
		if(answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
	}
}
}
