package org.firstinspires.ftc.teamcode.drive.opmode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.drive.DrivetrainPractice;

@TeleOp(name = "PracticeOpMode", group = "Linear Opmode")
public class PracticeOpMode extends LinearOpMode {
    DrivetrainPractice drive = new DrivetrainPractice(hardwareMap);

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        while (opModeIsActive()) {
            drive.update(gamepad1.left_stick_y, gamepad1.right_stick_y);
        }

    }
}
