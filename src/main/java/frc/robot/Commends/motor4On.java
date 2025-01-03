
package frc.robot.Commends;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.protoType.PrototypeConstance;
import frc.robot.Subsystems.protoType.protoType;

public class motor4On extends Command {
  public static protoType proto = protoType.getInstance();

  public motor4On() {
    addRequirements(proto);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    proto.setVoltageMotor4(PrototypeConstance.VOLT);
  }

  @Override
  public void end(boolean interrupted) {
    proto.setVoltageMotor4(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
