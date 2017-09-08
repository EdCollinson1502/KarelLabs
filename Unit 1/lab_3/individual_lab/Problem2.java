package lab_3.individual_lab;

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

    public void carpetRooms(){
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
        MoveToRoom();
        CarpetRoom();
        LeaveRoom();
    }
    public void MoveToRoom(){
        move();
        turnLeft();
        move();        
    }

    public void CarpetRoom(){
        if(checkLeftWall() && checkRightWall() && checkCeiling()){
            putBeeper();
        }
    }
    public void LeaveRoom(){
        faceSouth();
        move();
        turnLeft();
    }
    public boolean checkLeftWall(){
        faceWest();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean checkRightWall(){
        faceEast();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean checkCeiling(){
        faceNorth();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
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
    public void faceEast(){
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
                    if(facingWest()) {
                        turnLeft();
                    }    
                }
        }
    }         
    public void faceNorth(){
        if(facingSouth()) {
                turnLeft();
                turnLeft();
        }
        else
        {
                if(facingWest())  { 
                        turnRight();
                }
                else {
                    if(facingEast()) {
                        turnLeft();
                    }    
                }
        }
    }         
    public void faceSouth(){
        if(facingNorth()) {
                turnLeft();
                turnLeft();
        }
        else
        {
                if(facingEast())  { 
                        turnRight();
                }
                else {
                    if(facingWest()) {
                        turnLeft();
                    }    
                }
        }
    }         
    public void faceWest(){
        if(facingEast()) {
                turnLeft();
                turnLeft();
        }
        else
        {
                if(facingSouth())  { 
                        turnRight();
                }
                else {
                    if(facingNorth()) {
                        turnLeft();
                    }    
                }
        }
    }         
}

