package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import static java.lang.Math.*;
//Back up in case failier to do odometry
public class Drivetrain15058 {
    //Drive Motors
    public final DcMotorEx topLeft, topRight, bottomLeft, bottomRight;
    //Mo
    double LF, RF, LR, RR;

    private boolean safemode = false;

    public Drivetrain15058(HardwareMap map, boolean safemode){

        topLeft = map.get(DcMotorEx.class, "TL");
        topRight = map.get(DcMotorEx.class, "TR");
        bottomLeft = map.get(DcMotorEx.class, "BL");
        bottomRight = map.get(DcMotorEx.class, "BR");

        topLeft.setDirection(DcMotorEx.Direction.REVERSE);
        bottomLeft.setDirection(DcMotorEx.Direction.REVERSE);

        this.safemode = safemode;
    }

    public void update(double x, double y, double turn) {//changed update method
        double power = hypot(x,y);
        double theta = atan2(y,x);
        double sin = sin(theta - PI/4);
        double cos = cos(theta - PI/4);
        double max = max(Math.abs(sin),Math.abs(cos));
        LF = power*cos/max-turn;// changed +
        RF = power*sin/max+turn;// changed -
        LR = power*sin/max-turn;//changed +
        RR = power*cos/max+turn;
        if((power+abs(turn))>1) {
            double a=power+abs(turn)
                    ;
            LF/=a;
            RF/=a;
            LR/=a;
            RR/=a;
        }
        update();
    }

    public void update() {
        double coef = 1;
        if(abs(LF)>1||abs(RF)>1||abs(LR)>1||abs(RR)>1) {
            coef = max(max(abs(LF),abs(RF)),max(abs(LR),abs(RR)));
            LF /= coef;
            RF /= coef;
            LR /= coef;
            RR /= coef;
        }
        LF = Double.isNaN(LF)?0:LF;
        RF = Double.isNaN(RF)?0:RF;
        LR = Double.isNaN(LR)?0:LR;
        RR = Double.isNaN(RR)?0:RR;
        if(safemode)return;
        topLeft.setPower(LF);
        topRight.setPower(RF);
        bottomLeft.setPower(LR);
        bottomRight.setPower(RR);
    }
}
