package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class OdometryHardware {
    public DcMotor topLeft, topRight, bottomLeft, bottomRight;
    public DcMotor encoderLeft, encoderRight, encoderAux;

    private HardwareMap hardwareMap;

    public OdometryHardware(HardwareMap aHardwaremap){
        hardwareMap = aHardwaremap;

        topLeft = hardwareMap.dcMotor.get("TL");
        topLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        topRight = hardwareMap.dcMotor.get("TR");
        topRight.setDirection(DcMotorSimple.Direction.REVERSE);
        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        bottomLeft = hardwareMap.dcMotor.get("BL");
        bottomLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        bottomLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bottomLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        bottomRight = hardwareMap.dcMotor.get("BR");
        bottomRight.setDirection(DcMotorSimple.Direction.REVERSE);
        bottomRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bottomRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        encoderLeft = topLeft;
        encoderRight = topRight;
        encoderAux = bottomLeft;

        stop();
        resetDriveEncoders();
    }

    public void resetDriveEncoders(){
        topLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        topLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        topRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        topRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        bottomLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bottomLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void stop(){
        topLeft.setPower(0);
        topRight.setPower(0);
        bottomLeft.setPower(0);
        bottomRight.setPower(0);
    }

    final static double L = 20.12;
    final static double B = 11.5;
    final static double R = 3.0;
    final static double N = 2000;

    public int currentRightPosition = 0;
    public int currentLeftPosition = 0;
    public int currentAuxPosition = 0;

    private int oldRightPosition = 0;
    private int oldLeftPosition = 0;
    private int oldAuxPosition = 0;

    //public XyhVector START_POS = new XyhVector(213,102,Math.toRadians(-174));
    //public XyhVector pos = new XyhVector(START_POS);

    public void odometry(){
        oldRightPosition = currentRightPosition;
        oldLeftPosition = currentLeftPosition;
        oldAuxPosition = currentAuxPosition;


    }
}
