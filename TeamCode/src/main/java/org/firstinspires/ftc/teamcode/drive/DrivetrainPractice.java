package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DrivetrainPractice  {
    public final DcMotorEx leftTop, rightTop, leftBottom, rightBottom;
    public DrivetrainPractice(HardwareMap hwmp){

        leftTop = hwmp.get(DcMotorEx .class,"LT");
        rightTop = hwmp.get(DcMotorEx .class,"RT");
        leftBottom = hwmp.get(DcMotorEx .class,"LB");
        rightBottom = hwmp.get(DcMotorEx .class,"RB");


        leftTop.setDirection(DcMotorSimple.Direction.REVERSE);
        rightTop.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBottom.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBottom.setDirection(DcMotorSimple.Direction.REVERSE);

}
    public void update(float leftJoystick_y, float rightJoystick_y){

        float leftpower = leftJoystick_y;
        float rightpower = rightJoystick_y;

        leftTop.setPower(leftpower);
        rightTop.setPower(rightpower);
        leftBottom.setPower(leftpower);
        rightBottom.setPower(rightpower);


    }

}
