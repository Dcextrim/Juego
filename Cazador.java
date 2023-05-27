import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cazador extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
    }
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100)<10);
        {
           turn(Greenfoot.getRandomNumber(90)-45); 
        }
        if (getX()<=5 || getX() >=getWorld().getWidth()-5)
        {
            turn(180);
        }
        if (getY()<=5 || getY()>=getWorld().getWidth()-5)
        {
            turn(180);
        }
    }
    public void eat()
    {
        Actor lobo;
        lobo=getOneObjectAtOffset(0,0,Lobo.class);
        if (lobo!=null)
        {
            World world;
            world=getWorld();
            world.removeObject(lobo);
            Greenfoot.playSound("disparo.wav");
        }
        
    }
}
