// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    // JoyStick constants
    public static final int JOYSTICK_A = 0; 
    public static final Joystick JSTICK = new Joystick(JOYSTICK_A);

    // DriveTrain constants
    public static final int DRIVE_LEFT_BACK = 0;
    public static final int DRIVE_LEFT_FRONT = 1;
    public static final int DRIVE_RIGHT_BACK = 2;
    public static final int DRIVE_RIGHT_FRONT = 3;

    // Intake constants
    public static final int AGITATOR_PWM = 4;
    public static final int ROLLER_PWM = 6;
    public static final int ARM_PWM = 7;
}
