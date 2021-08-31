import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    int x = Greenfoot.getRandomNumber(this.getWidth())+1;
    int y = Greenfoot.getRandomNumber(this.getHeight())+1;
    private int stepCounter;
    
    public MyWorld()
    {    
        super(1000, 600, 1); 
        Frog greenFrog = new Frog();
        this.addObject(greenFrog, this.getWidth()/2, this.getHeight()/2);
    }
    
    public void act()
    {
        stepCounter++;
        if(stepCounter % 50 == 0){
            Flower redFlower = new Flower();
            int x = Greenfoot.getRandomNumber(this.getWidth())+1;
            int y = Greenfoot.getRandomNumber(this.getHeight())+1;
            addObject(redFlower, x, y);
        }
    }
}