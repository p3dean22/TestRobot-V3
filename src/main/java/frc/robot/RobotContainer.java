// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.MoveIntakeArm;
import frc.robot.commands.StartIntake;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem driveSub = new ExampleSubsystem();
  private final Intake intake = new Intake();
  private final JoystickButton intakeIn;
  private final JoystickButton intakeUp;
  private final JoystickButton intakeDown;
  private final JoystickButton intakeOut;
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    intakeIn = new JoystickButton(Constants.JSTICK,3);
    intakeUp = new JoystickButton(Constants.JSTICK,5);
    intakeDown = new JoystickButton(Constants.JSTICK,4);
    intakeOut = new JoystickButton(Constants.JSTICK, 2);
    configureButtonBindings();
    
    
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    driveSub.setDefaultCommand(new RunCommand(() -> 
      driveSub.arcadeDrive(
        Constants.JSTICK.getY(), 
        Constants.JSTICK.getX())
        
        ,driveSub
        ));
      
    intakeIn.whileHeld(new StartIntake(intake, -1));
    intakeOut.whileHeld(new StartIntake(intake, 1));
    intakeUp.whileHeld(new MoveIntakeArm(intake, -0.75));
    intakeDown.whileHeld(new MoveIntakeArm(intake, 0.5));
    
    
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    Command m_autoCommand = null;
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
