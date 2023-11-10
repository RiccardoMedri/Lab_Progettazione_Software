package it.unibo.design.robot.api; 

import it.unibo.design.robot.environment.api.Position2D;        //Position2D usato nell'ultimo metodo come tipo di ritorno, è stato importato per usare il tipo di classe come tipo di ritorno in getPosition ma non viene completamente implementato

/**
 * A robot that can move
 *
 */
public interface Robot {

    /**
     * Moves the robot up by one unit
     * 
     * @return true if a movement has been performed
     */
    boolean moveUp();

    /**
     * Moves the robot down by one unit
     * 
     * @return true if a movement has been performed
     */
    boolean moveDown();

    /**
     * Moves the robot left by one unit
     * 
     * @return true if a movement has been performed
     */
    boolean moveLeft();

    /**
     * Moves the robot right by one unit
     * 
     * @return true if a movement has been performed
     */
    boolean moveRight();

    /**
     * Fully recharge the robot
     */
    void recharge();

    /**
     * @return The robot's current battery level
     */
    double getBatteryLevel();

    /**
     * @return The robot environment
     */ 
    Position2D getPosition();               //quindi restituisce le coordinate x e y?

}
