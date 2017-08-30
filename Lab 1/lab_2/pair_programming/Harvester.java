package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author : Edward T Collinson 
 * teacher : Mr. Appel
 * due date: Tomorrow
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    public void sow() {
      repositionOrigin();
      sowTwoRows();
      sowTwoRows();
      sowTwoRows();
    }
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested\\
      move();
      harvestTwoRows();
      harvestTwoRows();
      harvestTwoRows();
      sow();
      repositionOrigin();
    }
    /**
     * Precondition: Robot facing east and one block away from a row beepers
     * Postcondition: Robot facing east, two streets away from where it started, one block away from a beeper
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionLeft();
        harvestOneRow();
        repositionRight();
    }
    public void harvestOneRow() {
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
    public void repositionRight()  {
        turnRight();
        move();
        turnRight();
    }
    public void repositionLeft()  {
        turnLeft();
        move();
        turnLeft();       
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void sowTwoRows() {
        sowOneRow();
        repositionLeft();
        sowOneRow();
        repositionRight();
    }
    public void repositionOrigin() {
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
    }
    public void sowOneRow() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
}

