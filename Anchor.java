import greenfoot.*;

public class Anchor extends Actor
{
    private int count;
    private int t;
    public Anchor()
    {
        count = 0;
        t = -1;
        setRotation(90);
    }
    public void act()
    {
        count++;
        if(count%200==0)
            count=1;
        if(count>100)
            t=1;
        if(count<100)
            t=-1;
        turn(t); 
        
        World w = this.getWorld();
        this.setLocation(this.getX(), this.getY()+2);
        if(this.getY() == w.getHeight()-2)
        {
            w.removeObject(this);
        }
    }
}
