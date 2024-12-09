
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import frc.robot.Commends.allMotorsOn;
import frc.robot.Commends.motor1On;
import frc.robot.Commends.motor2On;
import frc.robot.Commends.motor3On;
import frc.robot.Commends.motor4On;



public class RobotContainer {

  private CommandPS5Controller controller;

  public RobotContainer() {
    controller = new CommandPS5Controller(PortMap.controller.CONTROLLER);

    configureBindings();
  }

  private void configureBindings() {
    controller.L1().whileTrue(new allMotorsOn());
    controller.R1().whileTrue(new motor1On());
    controller.cross().whileTrue(new motor2On());
    controller.R2().whileTrue(new motor3On());
    controller.circle().whileTrue(new motor4On());
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
