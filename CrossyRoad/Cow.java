import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cow extends Obstacle
{
    /**
     * Act - do whatever the Cow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setLocation (getX() + 1, getY()); //move cow
      checkWall();
    }    
    public void checkWall()
    {
      if (getX() == 599){
        getWorld().removeObject(this);
        MyWorld.cownumber -= 1;
      }        
    }
}
