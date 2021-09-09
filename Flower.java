import greenfoot.*;

public class Flower extends Actor
{
    private GreenfootImage x = new GreenfootImage("newFlower.png");
    private int t;
    public Flower()
    {
        this.setImage(x);
        x.scale(70, 70);
    }
    public void act()
    {
        turn(2);
        t++;
        if(t>=180){
            x.setTransparency(255-(t-180));
            this.setImage(x);
        }
        if(t==435)
        {
            this.getWorld().removeObject(this);
        }
    }
}
