package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        figureOfEight();
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
    public void figureOfEight() {
        turnLeft();
        move();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        move();
        turnRight();
        
    }
}