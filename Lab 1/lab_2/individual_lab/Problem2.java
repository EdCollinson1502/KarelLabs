package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setRowOne();
        setRowTwo();
        setRowThree();
        setRowFour();
        setRowFive();
        setRowSix();
        setRowSeven();
    }
    public void setRowOne(){
        move();
        putBeeper();
        turnRight();
        move();
        turnLeft();
        move();
    }
    public void setRowTwo(){
        putBeeper();
        turnLeft();
        moveTwo();
        putBeeper();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void setRowThree(){
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void setRowFour(){
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
        turnRight();
        move();
        turnRight();
    }
      public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
    public void pickAndRun() {
        pickBeeper();
        turnLeft();
        move();
        move();
        move();
    }
    public void finalDump() {
            putBeeper();
            putBeeper();
            putBeeper();
            putBeeper();
        
        
    }
    public void miniRun() {
            pickBeeper();
            move();
            move();
            move();
        
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
    public void doubleRight() {
        turnRight();
            turnRight();
        
    }
    public void doublePAR() {
        pickAndRun();
            pickAndRun();
        
    }
    public void pickThenMove()  {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void turn180() {
        turnLeft();
        turnLeft();
    }
    public void MTOL() {
        
        turnLeft();
        moveTwo();
        turnLeft();
      
    }
    public void MTAR() {
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        move();
        turnRight();
        
    }
    public void placeAllFive() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        
        
    }
    public void MTM() {
        moveTwo();
        turnRight();
        moveTwo();
        
    }
}
