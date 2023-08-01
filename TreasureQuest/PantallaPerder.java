import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaPerder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaPerder extends World
{

    /**
     * Constructor for objects of class PantallaPerder.
     * 
     */
    public PantallaPerder()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        showText("¡Te han atrapado! Has perdido.", getWidth() / 2, getHeight() / 2);
        prepare();
    }

    private void prepare()
    {
        BotonVolver botonVolver = new BotonVolver();
        addObject(botonVolver,452,460);
    }
}
