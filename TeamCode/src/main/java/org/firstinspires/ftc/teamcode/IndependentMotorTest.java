package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class IndependentMotorTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeft");
        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeft");
        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRight");
        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRight");

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.dpad_up) {
                if (gamepad1.dpad_left) {
                    frontLeftMotor.setPower(1);
                } else if (gamepad1.dpad_right) {
                    frontRightMotor.setPower(1);
                }
            } else if (gamepad1.dpad_down) {
                if (gamepad1.dpad_left) {
                    backLeftMotor.setPower(1);
                } else if (gamepad1.dpad_right) {
                    backRightMotor.setPower(1);
                }
            }
        }
    }
}
