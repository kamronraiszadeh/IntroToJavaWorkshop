package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		System.out.println("hello world");
		Robot friend =new Robot ("mini");
		friend.penDown();
		friend.setSpeed(10);
		friend.setPenColor(0,255,0);
		friend.turn(90);
		friend.move(100);
		friend.setPenColor(255,0,0);
		friend.turn(90);
        friend.move(100);
        friend.setPenColor(0,0,255);
        friend.turn(90);
        friend.move(100);
        friend.setPenColor(255,255,255);
        friend.turn(90);
        friend.move(100);
	}   
}
