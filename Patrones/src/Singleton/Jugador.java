package Singleton;

/**
 *
 * @author david
 */
public class Jugador {
    private Ogros shrek;

    public Jugador() {
        shrek=Ogros.getOgros();
    }
    
    public void destruirOgro(){
        shrek.eliminaOgros();
    }
    
    
}
