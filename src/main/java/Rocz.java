import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Rocz - a robot by (your name here)
 */

public class Rocz extends Robot
{
	/**
	 * run: Rocz's default behavior
	 */
    public void run() {
        // Set the robot's initial heading to move towards the top of the battlefield
		setColors(java.awt.Color.PINK, java.awt.Color.PINK, java.awt.Color.PINK);

        setTurnLeft(getHeading());

        // Move to the top-left corner of the battlefield
        while (true) {
            ahead(getBattleFieldHeight() - getY());
            turnRight(90);
            ahead(getBattleFieldWidth() - getX());
            turnRight(90);
        }
    }

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
        // Check if the enemy robot is close
        if (event.getDistance() < 200) {
            // Aim gun at the enemy robot
            turnGunRight(getHeading() - getGunHeading() + event.getBearing());

            // Fire at the enemy robot
            fire(3);
        }
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}

