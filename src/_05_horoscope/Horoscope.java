package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String starSign = JOptionPane.showInputDialog("What is your star sign?");
	if(starSign.equalsIgnoreCase("Aries")){
		JOptionPane.showMessageDialog(null, "You will win a lot of money today!");
	}else if(starSign.equalsIgnoreCase("Taurus")){
		JOptionPane.showMessageDialog(null, "Today will be your happiest day!");
	}else if(starSign.equalsIgnoreCase("Gemeni")){
		JOptionPane.showMessageDialog(null, "You will have a day off of work today!");
	}else if(starSign.equalsIgnoreCase("Cancer")){
		JOptionPane.showMessageDialog(null, "You will become famous today!");
	}else if(starSign.equalsIgnoreCase("Leo")){
		JOptionPane.showMessageDialog(null, "You will have good news coming today!");
	}else {
		JOptionPane.showMessageDialog(null, "That sign is not available/not a sign.");
	}
}
}
