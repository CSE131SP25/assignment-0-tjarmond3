package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(160);
		robot.turnLeft(30);
		robot.forward(150);
		robot.turnRight(80);
		robot.forward(100);
		robot.turnRight(80);
		robot.forward(100);
		robot.turnRight(81);
		robot.forward(154);
		robot.turnRight(151);
		robot.forward(196);
		robot.turnLeft(181);
		robot.forward(65);
		robot.turnRight(90);
		robot.forward(73);
		robot.turnRight(181);
		robot.forward(147);
		robot.turnLeft(181);
		robot.forward(74);
		robot.turnLeft(90);
		robot.forward(360);
	}

}
