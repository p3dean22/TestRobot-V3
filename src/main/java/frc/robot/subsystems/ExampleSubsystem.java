// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleSubsystem extends SubsystemBase {
  private SpeedController scRB, scRF, scLB, scLF;

  private SpeedControllerGroup scgR, scgL;

  private DifferentialDrive drive;






  public ExampleSubsystem() {
    scRB = new Talon(Constants.DRIVE_RIGHT_BACK);
    scRF = new Talon(Constants.DRIVE_RIGHT_FRONT);
    scLB = new Talon(Constants.DRIVE_LEFT_BACK);
    scLF = new Talon(Constants.DRIVE_LEFT_FRONT);

    scgR = new SpeedControllerGroup(scRF, scRB);
    scgL = new SpeedControllerGroup(scLF, scLB);

    drive = new DifferentialDrive(scgL, scgR);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double y, double x){
    drive.arcadeDrive(-y, x);
  }
}
