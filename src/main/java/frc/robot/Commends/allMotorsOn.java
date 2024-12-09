
package frc.robot.Commends;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.protoType.PrototypeConstance;
import frc.robot.Subsystems.protoType.protoType;

public class allMotorsOn extends Command {
  public static protoType proto = protoType.getInstance();
  public allMotorsOn() {
    addRequirements(proto);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    proto.setVoltageMotor1(PrototypeConstance.VOLT);
    proto.setVoltageMotor2(PrototypeConstance.VOLT);
    proto.setVoltageMotor3(PrototypeConstance.VOLT);
    proto.setVoltageMotor4(PrototypeConstance.VOLT);
  }

  @Override
  public void end(boolean interrupted) {
    proto.setVoltageMotor1(0);
    proto.setVoltageMotor2(0);
    proto.setVoltageMotor3(0);
    proto.setVoltageMotor4(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
