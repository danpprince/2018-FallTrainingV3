/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
// #region Import Statements
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.Date;

import org.usfirst.frc.team4028.robot.auton.pathfollowing.Paths;
import org.usfirst.frc.team4028.robot.commands.Elevator_ZeroElevator;
import org.usfirst.frc.team4028.robot.commands.Infeed_ZeroInfeedArms;
import org.usfirst.frc.team4028.robot.sensors.SwitchableCameraServer;
import org.usfirst.frc.team4028.robot.subsystems.Carriage;
import org.usfirst.frc.team4028.robot.subsystems.Chassis;
import org.usfirst.frc.team4028.robot.subsystems.Climber;
import org.usfirst.frc.team4028.robot.subsystems.Elevator;
import org.usfirst.frc.team4028.robot.subsystems.Infeed;
import org.usfirst.frc.team4028.robot.util.GeneralUtilities;
import org.usfirst.frc.team4028.robot.util.LogDataBE;
import org.usfirst.frc.team4028.robot.util.MovingAverage;
import org.usfirst.frc.team4028.robot.util.DataLogger;
// #endregion

/**
 * The VM is configured to automatically run this class
 */
public class Robot extends TimedRobot 
{
	private static final String ROBOT_NAME = "2018-FallTrainingV3";
	
	// create instance of singelton Subsystems
	private Dashboard _dashboard = Dashboard.getInstance();
	
	//private Carriage _carriage = Carriage.getInstance();
	private Chassis _chassis = Chassis.getInstance();
	//private Climber _climber = Climber.getInstance();
	//private Elevator _elevator = Elevator.getInstance();
	//private Infeed _infeed = Infeed.getInstance();
	private OI _oi = OI.getInstance();
	//private SwitchableCameraServer _camera = SwitchableCameraServer.getInstance();

	
	// class level working variables
	private DataLogger _dataLogger = null;
	private String _buildMsg = "?";
 	long _lastScanEndTimeInMSec = 0;
 	long _lastDashboardWriteTimeMSec;
 	MovingAverage _scanTimeSamples;
 	
	/**
	 * This function is run when the robot is first started up and should be used for any initialization code.
	 */
	@Override
	public void robotInit() 
	{
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();

	}

	/**
	 * This method runs 1x when the robot enters auton mode
	 */
	@Override
	public void autonomousInit() {
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() 
	{
		Scheduler.getInstance().run();
	}

	/**
	 * This method runs 1x when the robot enters telop mode
	 */
	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {}
}