package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  Edward Timothy Collinson of The British Empire
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnRight();
        moveTwo();
        MTOL();
        pickThenMove();
        turn180();
        MTM();
        turn180();
        placeAllFive();
        MTAR();
        
        
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
