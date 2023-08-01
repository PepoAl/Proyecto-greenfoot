import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonVolver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonVolver extends Actor
{
    /**
     * Act - do whatever the BotonVolver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new PantallaInicio()); // Cambiar al mundo de inicio cuando se haga clic en el botón "volver"
    }
}
}
