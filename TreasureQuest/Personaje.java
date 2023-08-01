import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje extends Actor
{
    private int puntaje = 0;
    private GreenfootImage etiquetaPuntaje = new GreenfootImage("Puntaje: 0", 
    24, Color.WHITE, Color.BLACK);

    
    public void act()
    {
        // Add your action code here.
        moverPersonaje();
        // Llama al método para verificar colisiones
        Tomartesoro();
    }
    private void moverPersonaje() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 1);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 1);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 1, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 1, getY());
        }
    }
    // Método para verificar colisiones
    private void Tomartesoro() 
    {
        // Obtén una referencia al actor con el que colisiona el personaje
        Actor tesoro;
        tesoro = getOneIntersectingObject(tesoro.class);
        if (tesoro != null)
        {
            if (tesoro instanceof tesoro) {
                getWorld().removeObject(tesoro);
                puntaje++; 
                actualizaretiquetaPuntaje(); 
                ((laberinto) getWorld()).recogerTesoro();
            }
        }
    }
    private void actualizaretiquetaPuntaje() {
        etiquetaPuntaje = new GreenfootImage("Puntaje: " + puntaje, 24, 
        Color.WHITE, Color.BLACK);
        getWorld().showText("",100, 20);
        getWorld().getBackground().drawImage(etiquetaPuntaje, 100, 20);
    }
    }