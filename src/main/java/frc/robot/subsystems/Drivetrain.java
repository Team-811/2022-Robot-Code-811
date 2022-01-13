package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.hal.CANData;
import edu.wpi.first.hal.PWMJNI;
import edu.wpi.first.hal.can.CANJNI;
import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.lib.Drive;
import frc.robot.lib.Output;


public class Drivetrain extends SubsystemBase implements ISubsystem{

    private static Drivetrain instance = new Drivetrain();
    public static Drivetrain getInstance() {
        return instance;
      }
      
    private CANSparkMax leftWheels;
    private CANSparkMax rightWheels;
    private Drive drivetrain;
    private Output driveOutput;
      


    public Drivetrain(){
        leftWheels = new CANSparkMax(RobotMap.DRIVE_TRAIN_LEFT, MotorType.kBrushless);
        rightWheels= new CANSparkMax(RobotMap.DRIVE_TRAIN_RIGHT, MotorType.kBrushless);
        resetSubsystem();
    }

    private double SpeedScale = Constants.DRIVETRAIN_SPEED_SCALE;
    public void driveWithMisery(double leftStick, double rightStick, double rotation){
        driveOutput = drivetrain.arcadeDrive(leftStick * SpeedScale, rotation * SpeedScale * 0.8);

        leftWheels.set(driveOutput.getLeftValue());  
        rightWheels.set(-driveOutput.getRightValue());  
    }

    public void leftWheelsForward(double speed){
        leftWheels.set(speed);
    }
    public void leftWheelsBackards(double speed){
        leftWheels.set(-speed);
    }
    public void rightWheelsForward(double speed){
        rightWheels.set(speed);
    }
    public void rightWheelsBackards(double speed){
        rightWheels.set(-speed);
    }

    @Override
    public void outputSmartdashboard() {

    }

    @Override
    public void zeroSensors() {

    }

    @Override
    public void resetSubsystem() {

    }

    @Override
    public void testSubsystem() {

    }

    
}
