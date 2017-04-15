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
    private int Score = 0;
    public static int cownumber = 0;
    public static int carnumber = 0;
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
        if (carnumber < 3*Character.level && Greenfoot.getRandomNumber(300) > (298 - (Score/5000))){
            addObject (new Car(), 0, 90);
            carnumber += 1;
        } 
        if (cownumber < 3*Character.level && Greenfoot.getRandomNumber(300) > (298- (Score/5000))){
            addObject (new Cow(), 0, 250);
            cownumber += 1;
        } 
        if (character.hitCar() == true || character.hitCow() == true) {
            gameOver();
        }
        else{
            Score ++;
        }
    }
    /** 
    * Adds the GameOver object and terminates the game
    */     
    public void gameOver() {
        Greenfoot.playSound("end.wav"); //play sound if dog hit obstacle
        addObject(new GameOver(Score/10), getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }    
}
