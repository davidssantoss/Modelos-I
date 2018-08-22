package Singleton;

/**
 *
 * @author david
 */
public final class Ogros {
    private static final Ogros shrek = new Ogros();
    private static int cantidad;
    
    private Ogros(){
        cantidad=10;
    }

    public static Ogros getOgros() {
        return shrek;
    }

    public static void eliminaOgros() {
        
        if (cantidad > 0){
            cantidad--;
            System.out.println("Acabo de eliminar un ogro! Jajaja ☻");
        }        
    }
    public static void creaOgros(){
        
        if (cantidad > 0) {
            cantidad++;
            System.out.println("Soy el ogro rey y estoy llamando a otro guerrero ogro!! ");
            
        }
    }
    public static void ogrosRestantes(){
        if (cantidad > 0) {
            System.out.println("Quedan en el juego: "+ cantidad + " ogros");
        }else{
            System.out.println("Felicidades ya no hay ogros!!");
        }
    
}
    
    
}
