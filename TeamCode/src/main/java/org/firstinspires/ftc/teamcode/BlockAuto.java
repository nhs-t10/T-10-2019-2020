package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


@Autonomous(name= "BlockAuto")
public class BlockAuto extends Library {
 /*
    T-10 Preliminary Autonomous
    This is based on the assumption that we are:
        - On the side with the blocks
*/

//This is the enum for showing which state of autonomus the robot is in
enum state {
        START, ;
    }
    
    state currentState = null;

    public void init() {
        initialize_robot();
        currentState = state.START;
    }
