
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commends.MotorNeg;
import frc.robot.Commends.motor4On;



public class RobotContainer {

  private CommandXboxController controller;

  public RobotContainer() {
    controller = new CommandXboxController(PortMap.controller.CONTROLLER);

    configureBindings();
  }

  private void configureBindings() {
    //controller..whileTrue(new allMotorsOn());
    //controller.R1().whileTrue(new motor1On());
    //controller.cross().whileTrue(new motor2On());
    //controller.R2().whileTrue(new motor3On());
    controller.a().whileTrue(new motor4On());
    controller.y().whileTrue(new MotorNeg());
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
