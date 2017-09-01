package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void spellHello(){
        lineOne();
        lineTwo();
        lineThree();
        lineFour();
        lineFive();
    }
    public void lineOne(){
        turnLeft();
        moveThree();
        turnRight();
        move();
        turnRight();
        putBeeper();
        moveThree();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void lineTwo(){
        
    }
    public void lineThree(){
        
    }
    public void lineFour(){
        
    }
    public void lineFive(){
        
    }
    public void setRowFive(){
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        turnLeft();
        move();
        turnLeft();
       
    }
    public void setRowSeven(){
        move();
        putBeeper();
        moveTwo();
        moveTwo();
        turnRight();
        move();
        moveTwo();
        moveTwo();
        moveTwo();
        turnRight();
        moveTwo();
        moveTwo();
        turnRight();
    }
    public void setRowSix(){
        move();
        putBeeper();
        moveTwo();
        putBeeper();
        turnRight();
        move();
        turnRight();
        
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
