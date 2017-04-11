import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.*;

 /** 
 * @author Zovisk Zonk (Some code from the ScrollWorld 
 * project at the Greenfoot gallery)
 * @version 1.0
 */
public class Character extends Actor
{
    private int CounterFow = 0;
    private int CounterSide = 0;    

     /** 
      * Controls the direction of the Character and plays the corresponding 
      * sound based on the number of acts. The game gets very slow if the 
      * sound is played at every act.
      */     
    public void act() 
    {
        if (Greenfoot.isKeyDown("up") ) {
            setLocation (getX(), getY() - 2);
            if (CounterSide < 20){
                CounterSide ++;
            }
            else{
                CounterSide = 0;
            }                
        }
        if (Greenfoot.isKeyDown("down") ) {
            setLocation (getX(), getY() + 2);
            if (CounterSide < 20){
                CounterSide ++;
            }
            else{
                CounterSide = 0;
            }              
        }

        if (Greenfoot.isKeyDown("left") ) {
            setLocation (getX() - 2, getY());        
        }
        
        if (Greenfoot.isKeyDown("right") ) {
            setLocation (getX() + 2, getY());  
            if (CounterFow < 20){
                CounterFow ++;
            }
            else{
                CounterFow = 0;              
            }
        }
        
    }     

     /** 
      * Checks if the character has hit the piece
      */     
    public boolean hitPiece()
    {
        Actor piece = getOneObjectAtOffset(0, 0, Piece.class);
        if(piece != null) {
            return true;
        }
        else {
            return false;
        }
    }  
    
}