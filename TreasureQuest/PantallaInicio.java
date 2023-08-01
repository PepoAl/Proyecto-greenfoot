import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInicio extends World
{

    /**
     * Constructor for objects of class PantallaInicio.
     * 
     */
    public PantallaInicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        prepare();
        Greenfoot.playSound("musicajuego.wav");
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BotonIniciar botonIniciar = new BotonIniciar();
        addObject(botonIniciar,454,415);
    }
}
