import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    int x = Greenfoot.getRandomNumber(this.getWidth())+1;
    int y = Greenfoot.getRandomNumber(this.getHeight())+1;
    private int stepCounter;
    private int score = 0;
    public MyWorld()
    {    
        super(1000, 600, 1); 
        Frog greenFrog = new Frog();
        this.addObject(greenFrog, this.getWidth()/2, this.getHeight()/2);
        this.setBackground("cell.jpg");
        this.showText("Score: " + score, 50, 20);
        this.showText("Speed controls: 4++, 5--, 2 reset", 155, this.getHeight()-20);
    }
    
    public void act()
    {
        stepCounter++;
        if(stepCounter % 80 == 0){
            Flower redFlower = new Flower();
            int x = Greenfoot.getRandomNumber(this.getWidth())+1;
            int y = Greenfoot.getRandomNumber(this.getHeight())+1;
            addObject(redFlower, x, y);
        }
        if(stepCounter % 80 == 0){
            Anchor z = new Anchor();
            int x = Greenfoot.getRandomNumber(this.getWidth())+1;
            addObject(z, x, 10);
        }
        if(stepCounter % 150 == 0){
            score++;
            this.showText("Score: " + score, 50, 20);
        }
        if(Greenfoot.isKeyDown("1")){
            int x = Greenfoot.getRandomNumber(this.getWidth())+1;
            int y = Greenfoot.getRandomNumber(this.getHeight())+1;
            this.addObject(new Frog(), x, y);
        }
    }
}