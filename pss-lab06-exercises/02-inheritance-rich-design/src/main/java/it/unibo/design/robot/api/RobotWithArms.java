package it.unibo.design.robot.api;

import it.unibo.design.robot.api.Robot;

public interface RobotoWithArms extends Robot {

    boolean pickUp();               //restituisce vero se riesce e tirare su un oggetto
    
    boolean dropDown();             //restituisce vero se riesce a mollare un oggetto

    int getCarriedItemsCount();     //restituice il numero di oggetti trasportati in quel momento
}