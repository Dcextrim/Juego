import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobo extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    public void eat()
    {
        Actor oveja;
        oveja=getOneObjectAtOffset(0,0,Oveja.class);
        if (oveja!=null)
        {
            World world;
            world=getWorld();
            world.removeObject(oveja);
            Greenfoot.playSound("eating.wav");
        }
    }
}
