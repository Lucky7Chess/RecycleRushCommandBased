
package org.usfirst.frc.team293.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive myDrive  = new RobotDrive(0, 1);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
    public void takeJoystickInputs(Joystick left,Joystick right) {
    	myDrive.tankDrive(left, right);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    

}

