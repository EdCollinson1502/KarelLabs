package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void faceEast()
{
        if(facingWest()) {
                turnLeft();
                turnLeft();
        }
        else
        {
                if(facingNorth())  { 
                        turnRight();
                }
                else {
                        turnLeft();
                }
        }
}                   
      public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveThree() {
        move();
        move();
        move();
    }
    public void moveTwo() {
        move();
        move();
        
    }
    public void turn180() {
        turnLeft();
        turnLeft();
    }
}

