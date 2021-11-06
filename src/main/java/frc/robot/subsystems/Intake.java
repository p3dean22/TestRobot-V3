// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Intake extends SubsystemBase {
  private PWMVictorSPX roller;
  private VictorSP agitator;
  private VictorSP arm;


  public Intake() {
    roller = new PWMVictorSPX(Constants.ROLLER_PWM);
    agitator = new VictorSP(Constants.AGITATOR_PWM);
    arm = new VictorSP(Constants.ARM_PWM);
    roller.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void in(double speed) {
    roller.setSpeed(speed);
  }
  
  public void stopRoller() {
    roller.stopMotor();
  }

  public void moveArm(double speed){
    arm.set(speed);
  }

  public void stopArm(){
    arm.stopMotor();
  }

  public void agitate(double speed){
    agitator.set(speed);
  }

  public void stopAgitate(){
    agitator.stopMotor();
  }

}
