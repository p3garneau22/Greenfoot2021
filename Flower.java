import greenfoot.*;

public class Flower extends Actor
{
    public Flower()
    {
        GreenfootImage x = new GreenfootImage("newFlower.png");
        this.setImage(x);
        x.scale(70, 70);
    }
    public void act()
    {
        turn(2);
        if(getRotation() == 0)
        {
            this.getWorld().removeObject(this);
        }
    }
}
