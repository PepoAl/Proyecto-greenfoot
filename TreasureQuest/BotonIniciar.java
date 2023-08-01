import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonIniciar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonIniciar extends Actor
{
    /**
     * Act - do whatever the BotonIniciar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new laberinto()); // Cambiar al mundo del juego cuando se haga clic en el botón de iniciod your action code here.
    }
}
}

