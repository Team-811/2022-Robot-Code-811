package frc.robot.lib;

public class Drive {
    private Output driveOutput;
  
    private int forwardBackwardInvert;
    private int rotationInvert;
    public Output arcadeDrive(double forwardValue, double rotationValue)
    {
      
        forwardValue = forwardValue * forwardBackwardInvert;
        rotationValue = rotationValue * rotationInvert;


        double leftValue = forwardValue + rotationValue;
        double rightValue = forwardValue - rotationValue;

        driveOutput.updateOutput(leftValue, rightValue);

        return driveOutput;
    }
}
