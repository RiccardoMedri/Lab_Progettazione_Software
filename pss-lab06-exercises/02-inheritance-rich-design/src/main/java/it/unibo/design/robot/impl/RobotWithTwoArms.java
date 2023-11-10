package it.unibo.design.robot.impl;

import it.unibo.design.robot.impl.BaseRobot;
import it.unibo.design.robot.impl.BasicArm ;
import it.unibo.design.robot.api.RobotoWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {
    
    private BasicArm right;
    private BasicArm left;
    private boolean statusRight;

    public RobotWithTwoArms(final String robotName) {
        
        super(robotName);
        this.right = new BasicArm(right);
        this.left = new BasicArm(left);
    }

    public boolean pickUp() {

        if (right.isGrabbing) {
            if(left.isGrabbing()) {
                return false;
            }
            
        }
    }
}
