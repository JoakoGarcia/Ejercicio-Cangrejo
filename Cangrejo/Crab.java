import greenfoot.*;
import  java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.util.ListIterator;  

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        gira();
        come();
    }
    
    public void gira()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void come()
    {
        if(isTouching(worm.class))
        {
            Greenfoot.playSound("eating.wav");
            removeTouching(worm.class);
            World mundo = getWorld();
            ((CrabWorld)mundo).comioGusano();
            List lista=mundo.getObjects(worm.class);
            if(lista.size()==0){
             Label etiquetaFin = new Label("WINNER PAPS",55);
             mundo.addObject(etiquetaFin,250,250);
             Greenfoot.stop();
            }
        }
     }
    }