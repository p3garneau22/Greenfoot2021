import greenfoot.*;

public class Frog extends Actor
{
    private int moveSpeed;
    private int score;
    private GreenfootImage l = new GreenfootImage("frogL.png");
    private GreenfootImage r = new GreenfootImage("frog.png");
    public Frog()
    {
        moveSpeed = 2;
        score = 0;
    }
    public void act()
    {
        makeMeMove();
        World w = this.getWorld();
        w.showText("Score: " + score, 50, 20);
        w.showText("Speed: " + moveSpeed, 50, 50);
        if(isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            score++;
            w.showText("Score: " + score, 50, 20);
        }
        if(score%10==0 && !(score==0))
        {
            score = 0;
            moveSpeed++;
        }
    }
    public void makeMeMove()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(moveSpeed);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            this.setImage(l);
            setRotation(180);
            move(moveSpeed);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(moveSpeed);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            this.setImage(r);
            setRotation(0);
            move(moveSpeed);
        }
        if(Greenfoot.isKeyDown("4"))
        {
            moveSpeed=50;
        }
        if(Greenfoot.isKeyDown("5"))
        {
            moveSpeed=2;
        }
        World w = this.getWorld();
        if(this.getX()==0)
            setLocation(w.getWidth()-2, this.getY());
        if(this.getX()==w.getWidth()-1)
            setLocation(1, this.getY());
    }
}
