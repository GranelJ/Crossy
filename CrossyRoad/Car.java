import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Obstacle
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setLocation (getX() + 2, getY()); //move car
      checkWall();
    }  
    public void checkWall()
    {
      if (getX() == 599){
        getWorld().removeObject(this);
        MyWorld.carnumber -= 1;
      }        
    }
}
