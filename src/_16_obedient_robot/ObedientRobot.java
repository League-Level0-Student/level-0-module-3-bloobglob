package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(10);
		String shapeChoice = JOptionPane.showInputDialog("What shape do you want?(Square, Triangle, or Circle)");
		String colorChoice = JOptionPane.showInputDialog("What color do you want?(red, green, or blue)");
		
		if(colorChoice.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(colorChoice.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(colorChoice.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}
		
		if(shapeChoice.equalsIgnoreCase("square")) {
			drawSquare();
		} else if(shapeChoice.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if(shapeChoice.equalsIgnoreCase("circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know that one.");
		}
	}

	static void drawSquare() {
		
		for(int i = 0; i<4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	static void drawTriangle() {
		for(int i = 0; i<3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	static void drawCircle() {
		for(int i = 0; i<360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
