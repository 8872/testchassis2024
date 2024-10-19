//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//@TeleOp
//public class TwoWheel extends LinearOpMode {
//    @Override
//    public void runOpMode() throws InterruptedException {
//        DcMotor leftMotor = hardwareMap.dcMotor.get("left");
//        DcMotor rightMotor = hardwareMap.dcMotor.get("right");
//
//        waitForStart();
//
//        if (isStopRequested()) return;
//
//        while (opModeIsActive()) {
//            double rx = gamepad1.right_trigger - gamepad1.left_trigger;
//            if (rx == 0) {
//                leftMotor.setPower(gamepad1.left_stick_y);
//                rightMotor.setPower(gamepad1.left_stick_y);
//            } else {
//                leftMotor.setPower(-rx);
//                rightMotor.setPower(rx);
//            }
//
////            leftMotor.setPower(-gamepad1.left_trigger);
////            rightMotor.setPower(-gamepad1.right_trigger);
////            leftMotor.setPower(1);
////            rightMotor.setPower(0);
////            2 weeks cad, 1 week shipping 2 weeks build (for hardware), business 4 week port)
//        }
//    }
//}
