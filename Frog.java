import greenfoot.*;
import java.util.ArrayList;

public class Frog extends Actor
{
    private int moveSpeed;
    private GreenfootImage l = new GreenfootImage("frogL.png");
    private GreenfootImage r = new GreenfootImage("frog.png");
    
    public Frog()
    {
        moveSpeed = 3;
    }
    
    public void act()
    {
        makeMeMove();
        World w = this.getWorld();
        w.showText("Speed: " + moveSpeed, 50, w.getHeight()-50);
        if(isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            int x = Greenfoot.getRandomNumber(w.getWidth())+1;
            int y = Greenfoot.getRandomNumber(w.getHeight())+1;
            w.addObject(new Frog(), x, y);
            
        }
        if(isTouching(Anchor.class))
        {
            w.removeObject(this);
        }
        if(w.getObjects(Frog.class).size() == 0){
            w.showText("GAME OVER", w.getWidth()/2, w.getHeight()/2);
            
            Greenfoot.stop();
        }
    }
    public void makeMeMove()
    {
        World w = this.getWorld();
        
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(moveSpeed);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            this.setImage(l);
            setRotation(180);
            move(moveSpeed);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(moveSpeed);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            this.setImage(r);
            setRotation(0);
            move(moveSpeed);
        }
        if(this.getY() == 0)
            this.setLocation(this.getX(), w.getHeight()-2);
        if(this.getX() == 0)
            this.setLocation(w.getWidth()-2,this.getY());
        if(this.getY() == w.getHeight()-1)
            this.setLocation(this.getX(),0);
        if(this.getX() == w.getWidth()-1)
                this.setLocation(0,this.getY());
        if(Greenfoot.isKeyDown("4"))
        {
            moveSpeed++;
        }
        if(Greenfoot.isKeyDown("5"))
        {
            moveSpeed--;
        }
        
        if(Greenfoot.isKeyDown("2"))
        {
            moveSpeed = 3;
        }
    }
}
