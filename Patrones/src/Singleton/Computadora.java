package Singleton;

/**
 *
 * @author david
 */
public class Computadora {
    private Ogros shrek = Ogros.getOgros();
    
    public Computadora(){
        shrek.getOgros();
        
    }
    
    public void creaOgros(){
        shrek.creaOgros();        
    }
    
}
