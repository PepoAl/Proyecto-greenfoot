import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laberinto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laberinto extends World
{
    private int numTesoros = 5; // Número total de tesoros en el nivel
    private int tesorosRecogidos = 0; // Contador de tesoros recogidos por el jugador
  
    public laberinto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 360, 1); 
        prepare();
        numTesoros = 5;

    }
     
    private void prepare() {
        // Agregar los tesoros al mundo
        for (int i = 0; i < numTesoros; i++) {
            addObject(new tesoro(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }

        enemigo enemigo = new enemigo();
        addObject(enemigo,799,192);
        Personaje personaje = new Personaje();
        addObject(personaje,82,224);
    }

   public void recogerTesoro() {
        tesorosRecogidos++;
        // Verifica si se han recogido todos los tesoros
        if (tesorosRecogidos == numTesoros) {
            mostrarMensajeVictoria(); // Llama al método para mostrar el mensaje de victoria
        }
    }
 private void mostrarMensajeVictoria() {
        showText("¡Has ganado el juego!", getWidth() / 2, getHeight() / 2);
        Greenfoot.delay(200); // Espera un tiempo para que el mensaje sea visible antes de cambiar al mundo de inicio o siguiente nivel
        Greenfoot.setWorld(new PantallaInicio()); // Cambia al mundo de inicio después de unos segundos 
    }

}

