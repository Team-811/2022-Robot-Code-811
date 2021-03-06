package frc.robot.lib;


public class Output {
    private double motorTopLeft;
    private double motorTopRight;
    private double motorBottomLeft;
    private double motorBottomRight;

    public Output()
    {
        motorTopLeft = 0;
        motorTopRight = 0;
        motorBottomLeft = 0;
        motorBottomRight = 0;
    }

    public Output(double leftValue, double rightValue)
    {
        motorTopLeft = leftValue;
        motorTopRight = rightValue;
        motorBottomLeft = 0;
        motorBottomRight = 0;
    }

    public Output(double topLeftValue, double topRightValue, double bottomLeftValue, double bottomRightValue)
    {
        motorTopLeft = topLeftValue;
        motorTopRight = topRightValue;
        motorBottomLeft = bottomLeftValue;
        motorBottomRight = bottomRightValue;
    }

    public double getLeftValue()
    {
        return motorTopLeft;
    }

    public double getRightValue()
    {
        return motorTopRight;
    }

    public double getTopLeftValue()
    {
        return motorTopLeft;
    }

    public double getTopRightValue()
    {
        return motorTopRight;
    }

    public double getBottomLeftValue()
    {
        return motorBottomLeft;
    }

    public double getBottomRightValue()
    {
        return motorBottomRight;
    }

    //Setter methods

    public void updateOutput(double leftValue, double rightValue)
    {
            motorTopLeft = leftValue;
            motorBottomLeft = leftValue;
            motorTopRight = rightValue; 
            motorBottomRight = rightValue;
    }

    public void updateOutput(double topLeftValue, double topRightValue, double bottomLeftValue, double bottomRightValue)
    {
        motorTopLeft = topLeftValue;
        motorTopRight = topRightValue;
        motorBottomLeft = bottomLeftValue;
        motorBottomRight = bottomRightValue;
    }

    //Clear all values

    public void clearOutput()
    {
        motorTopLeft = 0;
        motorTopRight = 0;
        motorBottomLeft = 0;
        motorBottomRight = 0;
    }

}
