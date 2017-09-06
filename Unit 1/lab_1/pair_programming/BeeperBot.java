package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Edward T. Collinson of the Great British Empire
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        doublePAR();
        moveThree();
        turnLeft();
        moveTwo();
        miniRun();
        doublePAR();
        pickBeeper();
        moveTwo();
        finalDump();
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
}