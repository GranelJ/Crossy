import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up") ) {
            setLocation (getX(), getY() - 2);
        }

        if (Greenfoot.isKeyDown("left") ) {
            setLocation (getX() - 2, getY());        
        }
        
        if (Greenfoot.isKeyDown("right") ) {
            setLocation (getX() + 2, getY());       
        }
    }    
    
    public boolean hitCar()
    {
        Actor car = getOneObjectAtOffset(0, 0, Car.class);
        if(car != null){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean arrived()
    {
        return(getY() == 0);
    }
}
