package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.opencv.core.Rect;

@Autonomous(name= "Block")
public class CraterAuto extends T10_Library {
	/*
		T-10 Preliminary Autonomous
		This is based on the assumption that we are:
			- Starting on the Block side
	 */

	// constants and state declaration
	enum state {
		DELIVERING, REPOSITIONING, PLACING, NAVIGATING;
	}
	state currentState = null;

	public void init() {
		initialize_robot();
		currentState = state.DELIVERING;
	}

	public void loop() {
		//Loop constantly checks state, and then executes a command based on this.
		if(currentState == state.DELEVERING){
			deliver();
		}
		if(currentState == state.REPOSITIONING){
			reposition();
		}
		if(currentState == state.PLACING){
			place();
		}
		if(currentState == state.NAVIGATING){
			navigate();
		}
		telemetry.addData("Current State: ", currentState);
	}

	public void deliver() {
		// Do delivering blocks
		currentState = state.REPOSITIONING;
	}

	public void reposition() {
		// Do repositioning build zone
		currentState = state.PLACING;
	}

	public void place() {
		// Do placing blocks
		currentState = state.NAVIGATING;
	}

	public void navigate() {
		// Do navigating, parking under bridge
	}
