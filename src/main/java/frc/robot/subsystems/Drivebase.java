// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.DRIVE_CONST.LEFT_FOLLOW_CAN;
import static frc.robot.Constants.DRIVE_CONST.LEFT_MASTER_CAN;
import static frc.robot.Constants.DRIVE_CONST.RIGHT_FOLLOW_CAN;
import static frc.robot.Constants.DRIVE_CONST.RIGHT_MASTER_CAN;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivebase extends SubsystemBase {
  /** Creates a new Drivebase. */

  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFT_MASTER_CAN);
  public WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFT_FOLLOW_CAN);
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHT_MASTER_CAN);
  public WPI_TalonSRX rightFollow = new WPI_TalonSRX(RIGHT_FOLLOW_CAN);

  public Drivebase() {
    leftFollow.follow(leftMaster);
    rightFollow.follow(rightMaster);
    leftMaster.setInverted(true);
    rightMaster.setInverted(true);
  }

  public void drive (double a, double b){
    leftMaster.set(a);
    rightMaster.set(b);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //nothing
  }
}
