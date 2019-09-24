package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.opencv.core.Rect;

@Autonomous(name= "Building")
public class Autonomous extends Library {

//This is the enum for showing which state of autonomus the robot is in
enum state {
        START, ;
    }
    state currentState = null;

    public void init() {
        initialize_robot();
        currentState = state.START;
    }
