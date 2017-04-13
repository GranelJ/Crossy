import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Character character;
    private Car car;
    private Cow cow;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        character = new Character();
        addObject (character, 300, 380);
        car = new Car();
        addObject (car, 0, 90);
        cow = new Cow();
        addObject (cow, 0, 250);
    }
    
    public void act()
    {
        /*if (Car.carnumber < 3){
            car = new Car();
            addObject (car, 0, 90);
        } */
        if (character.hitCar() == true || character.arrived() == true || character.hitCow() == true) {
            if (character.hitCar() == true ||character.hitCow() == true){
            Greenfoot.playSound("end.wav"); //play sound if dog hit obstacle
            }
            Greenfoot.stop();
        }
    }
}
