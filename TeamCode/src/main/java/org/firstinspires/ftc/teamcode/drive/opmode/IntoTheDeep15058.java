package org.firstinspires.ftc.teamcode.drive.opmode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import static org.firstinspires.ftc.teamcode.drive.UtilMeth.*;

import org.firstinspires.ftc.teamcode.drive.Drivetrain15058;

@TeleOp(name = "IntoTheDeep15058", group = "Linear OpMode")
public class IntoTheDeep15058 extends LinearOpMode {

    @Override
    public void runOpMode(){

        Drivetrain15058 drivetrain = new Drivetrain15058(hardwareMap, false);

        waitForStart();
        resetRuntime();

        while (opModeIsActive()) {

            float x = gamepad1.left_stick_x;
            float y = gamepad1.left_stick_y;
            float turn = -gamepad1.right_stick_x;
            drivetrain.update(clamp(x,-1f,1f),clamp(y,-1f,1f),clamp(turn,-1f,1f));

            telemetry.update();
        }
    }
}
