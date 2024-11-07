package org.firstinspires.ftc.teamcode.drive.opmode;/*
package org.firstinspires.ftc.teamcode.drive.opmode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
@Autonomous(name = "RedLeftSideAuto", group = "Autonomous")
public class RedRightSideAuto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        Trajectory phase1 = drive.trajectoryBuilder(new Pose2d())
                .forward(27)
                .build();
        Trajectory phase2 = drive.trajectoryBuilder(new Pose2d())
                .lineToConstantHeading(new Vector2d(48.2,-37))
                .forward(4)
                .build();
        Trajectory phase3 = drive.trajectoryBuilder(new Pose2d())
                .back(15)
                .build();
        Trajectory phase4 = drive.trajectoryBuilder(new Pose2d())
                .splineToConstantHeading(new Vector2d(58, -32), Math.toRadians(90))
                .build();
        Trajectory phase5 = drive.trajectoryBuilder(new Pose2d())
                .back(15)
                .build();
        Trajectory phase6 = drive.trajectoryBuilder(new Pose2d())
                .splineToSplineHeading(new Pose2d(58, -26, Math.toRadians(0)), Math.toRadians(90))
                .forward(2)
                .build();
        Trajectory phase7 = drive.trajectoryBuilder(new Pose2d())
                .back(1)
                .splineToSplineHeading(new Pose2d(58, -47, Math.toRadians(270)), Math.toRadians(90))
                .build();
        Trajectory phase8 = drive.trajectoryBuilder(new Pose2d())
                .splineToConstantHeading(new Vector2d(47,-60), Math.toRadians(270))
                .build();
        Trajectory phase9 = drive.trajectoryBuilder(new Pose2d())
                .lineToSplineHeading(new Pose2d(7.5,-34, Math.toRadians(90)))
                .build();
        Trajectory phase10 = drive.trajectoryBuilder(new Pose2d())
                .lineToSplineHeading(new Pose2d(47,-50, Math.toRadians(270)))
                .splineToConstantHeading(new Vector2d(47,-60), Math.toRadians(270))
                .build();
        Trajectory phase11 = drive.trajectoryBuilder(new Pose2d())
                .lineToSplineHeading(new Pose2d(18,-42, Math.toRadians(90)))
                .splineToConstantHeading(new Vector2d(6.5,-34),Math.toRadians(90))
                .build();
        Trajectory phase12 = drive.trajectoryBuilder(new Pose2d())
                .lineTo(new Vector2d(-35,-34))
                .splineTo(new Vector2d(-32,-10),Math.toRadians(90))
                .build();

        //
        drive.followTrajectory(phase1);
        sleep(1000);
        //
        drive.followTrajectory(phase2);
        sleep(100);
        //
        drive.followTrajectory(phase3);
        sleep(500);
        //
        drive.followTrajectory(phase4);
        sleep(500);
        //
        drive.followTrajectory(phase5);
        sleep(500);
        //
        drive.followTrajectory(phase6);
        sleep(500);
        //
        drive.followTrajectory(phase7);
        sleep(500);
        //
        drive.followTrajectory(phase8);
        sleep(500);
        //
        drive.followTrajectory(phase9);
        sleep(500);
        //
        drive.followTrajectory(phase10);
        sleep(500);
        //
        drive.followTrajectory(phase11);
        sleep(500);
        //
        drive.followTrajectory(phase12);
        sleep(500);
    }

    //Section 1
                        .splineToConstantHeading(new Vector2d(-37,-35),Math.toRadians(90))
                        .strafeRight(10)
                        .forward(8)
                        .waitSeconds(0.1)
                        //Section 2
                        .strafeLeft(4)
                        .splineToSplineHeading(new Pose2d(-54,-52,Math.toRadians(225)),Math.toRadians(180))
                        .waitSeconds(0.3)
                        //Section 3
                        .back(1)
                        .splineToSplineHeading(new Pose2d(-48,-25,Math.toRadians(180)),Math.toRadians(225))
                        .forward(8)
                        .waitSeconds(0.1)
                        //Section 4
                        .strafeLeft(4)
                        .splineToSplineHeading(new Pose2d(-54,-52,Math.toRadians(225)),Math.toRadians(180))
                        .waitSeconds(0.3)
                        //Section 5
                        .back(1)
                        .splineToSplineHeading(new Pose2d(-54,-25,Math.toRadians(180)),Math.toRadians(225))
                        .forward(7)
                        .waitSeconds(0.1)
                        //Section 6
                        .back(5)
                        .strafeLeft(4)
                        .splineToSplineHeading(new Pose2d(-54,-52,Math.toRadians(225)),Math.toRadians(180))
                        .waitSeconds(0.3)
                        //Section 7
                        .back(2)
                        .splineTo(new Vector2d(-25,10),Math.toRadians(0))
                        .build());

}
*/


