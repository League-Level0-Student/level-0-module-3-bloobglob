package _16_obedient_robot;

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
		if(shapeChoice.equalsIgnoreCase("square")) {
			if(colorChoice.equalsIgnoreCase("red")) {
				rob.setPenColor(1000, 0, 0);
			}else if(colorChoice.equalsIgnoreCase("green")) {
				rob.setPenColor(0, 1000, 0);
			}else if(colorChoice.equalsIgnoreCase("blue")) {
				rob.setPenColor(0, 0, 1000);
			}
			drawSquare();
		} else if(shapeChoice.equalsIgnoreCase("triangle")) {
			if(colorChoice.equalsIgnoreCase("red")) {
				rob.setPenColor(1000, 0, 0);
			}else if(colorChoice.equalsIgnoreCase("green")) {
				rob.setPenColor(0, 1000, 0);
			}else if(colorChoice.equalsIgnoreCase("blue")) {
				rob.setPenColor(0, 0, 1000);
			}
			drawTriangle();
		} else if(shapeChoice.equalsIgnoreCase("circle")) {
			if(colorChoice.equalsIgnoreCase("red")) {
				rob.setPenColor(1000, 0, 0);
			}else if(colorChoice.equalsIgnoreCase("green")) {
				rob.setPenColor(0, 1000, 0);
			}else if(colorChoice.equalsIgnoreCase("blue")) {
				rob.setPenColor(0, 0, 1000);
			}
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
