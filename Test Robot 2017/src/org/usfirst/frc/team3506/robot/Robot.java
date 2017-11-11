package org.usfirst.frc.team3506.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	Joystick leftJoystick;
	Joystick rightJoystick;
	Joystick tableLiftJoystick;
	
	CANTalon leftFrontMotor;
	CANTalon leftRearMotor;
	CANTalon rightFrontMotor;
	CANTalon rightRearMotor;
	Talon tableLiftMotor;
	
	long turnTimer;
	long driveTimer;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		tableLiftJoystick = new Joystick(2);
		
		tableLiftMotor = new Talon(0);
		
		leftFrontMotor = new CANTalon(1);
		leftFrontMotor.setInverted(true);
		
		leftRearMotor = new CANTalon(7);
		leftRearMotor.setInverted(true);
		
		rightFrontMotor = new CANTalon(4);
		rightRearMotor = new CANTalon(6);
	}
	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
	}
	
	@Override
	public void teleopPeriodic() {
		double leftY = leftJoystick.getY();
		double rightY = rightJoystick.getY();
		double tableLiftY = tableLiftJoystick.getY();
		
		tableLiftMotor.set(tableLiftY);
		
		leftFrontMotor.set(leftY);
		leftRearMotor.set(leftY);
		
		rightFrontMotor.set(rightY);
		rightRearMotor.set(rightY);
		
		if (leftJoystick.getRawButton(11) && turnTimer == 0
				&& driveTimer == 0) {
			turnTimer = System.currentTimeMillis() + 2000;
		}
		
		if (turnTimer != 0) {
			leftFrontMotor.set(-0.25);
			leftRearMotor.set(-0.25);
			rightFrontMotor.set(0.25);
			rightRearMotor.set(0.25);
			if (turnTimer < System.currentTimeMillis()) {
				turnTimer = 0;
				driveTimer = System.currentTimeMillis() + 4000;
			}
		}
		
		if (driveTimer != 0) {
			leftFrontMotor.set(-0.25);
			leftRearMotor.set(-0.25);
			rightFrontMotor.set(-0.25);
			rightRearMotor.set(-0.25);
			if (driveTimer < System.currentTimeMillis()) {
				driveTimer = 0;
			}
		}
	}
	
	@Override
	public void testPeriodic() {
	}
}

