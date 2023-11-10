package it.unibo.design.robot.impl;

public class BasicArm {
    
    private final int nomeBraccio;
    public static final int ENERGY_REQUIRED_LIFT = 1.2;
    public static final int ENERGY_REQUIRED_DROP = 0.4;
    private boolean inUse;


    public BasicArm(String nomeBraccio) {
        
        this.nomeBraccio = braccio;
    }

    public boolean isGrabbing() {

        return inUse;
    }

    public void pickUp() {
        
        if (this.inUse == false) {

            this.inUse = true;
        }
    }

    public void dropDown() {

        if(this.inUse == true) {

            this.inUse = false;
        }
    }

    public double getConsumptionForPickUp() {

        return BasicArm.ENERGY_REQUIRED_LIFT;
    }

    public double getConsumptionForDropDown() {

        return BasicArm.ENERGY_REQUIRED_DROP;
    }
}
