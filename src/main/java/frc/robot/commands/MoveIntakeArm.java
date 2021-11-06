
package frc.robot.commands;


import frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class MoveIntakeArm extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final Intake theIntake;
  private double speed;
  
  public MoveIntakeArm(Intake i, double s) {
    addRequirements(i);
    theIntake = i;
    this.speed = s;
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    theIntake.moveArm(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      theIntake.stopArm();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
