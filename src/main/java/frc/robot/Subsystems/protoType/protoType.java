package frc.robot.Subsystems.protoType;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class protoType extends SubsystemBase {
    private static protoType protoTyp; 
    // I know abut the typing mistake

    private final SparkMax motor1;
    private final SparkMax motor2;
    private final SparkMax motor3;
    private final SparkMax motor4;
    private final SparkMaxConfig motorConfig;

    private protoType() {
        motor1 = new SparkMax(PortMap.Proto.MOTOR_1_ID, MotorType.kBrushless);
        motor2 = new SparkMax(PortMap.Proto.MOTOR_2_ID, MotorType.kBrushless);
        motor3 = new SparkMax(PortMap.Proto.MOTOR_3_ID, MotorType.kBrushless);
        motor4 = new SparkMax(PortMap.Proto.MOTOR_4_ID, MotorType.kBrushless);
        motorConfig = new SparkMaxConfig();
        config();
    }

    private void config() {
        motorConfig.inverted(true);
        motorConfig.idleMode(IdleMode.kCoast);
        motorConfig.encoder.positionConversionFactor(1000);
        motorConfig.encoder.velocityConversionFactor(1000);
        motorConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder);
        
        motor1.configure(motorConfig, ResetMode.kResetSafeParameters,  PersistMode.kNoPersistParameters);
        motor2.configure(motorConfig, ResetMode.kResetSafeParameters,  PersistMode.kNoPersistParameters);
        motor3.configure(motorConfig, ResetMode.kResetSafeParameters,  PersistMode.kNoPersistParameters);
        motor4.configure(motorConfig, ResetMode.kResetSafeParameters,  PersistMode.kNoPersistParameters);
    }

    public void setVoltageMotor1(double volt) {
        motor1.setVoltage(volt);
    }

    public void setVoltageMotor2(double volt) {
        motor2.setVoltage(volt);
    }

    public void setVoltageMotor3(double volt) {
        motor3.setVoltage(volt);
    }

    public void setVoltageMotor4(double volt) {
        motor4.setVoltage(volt);
    }

    public static protoType getInstance() {
        if (protoTyp == null) {
            protoTyp = new protoType();
        }
        return protoTyp;
    }

    @Override
    public void periodic() {
    }
}
