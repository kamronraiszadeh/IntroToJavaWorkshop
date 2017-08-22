package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot friend =new Robot ("mini");
	
	void go() {
		drawTriangle(100); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50

		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		friend.setSpeed(10);
		friend.setAngle(60);
		friend.penDown();
		friend.setPenColor(0,0,255);
		friend.move(150);
		friend.turn(120);
		friend.setPenColor(255, 0, 0);
		friend.move(150);
		friend.setPenColor(0,255,0);
		friend.turn(120);
		friend.move(150);
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
