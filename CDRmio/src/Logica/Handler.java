/*
 * Clase abstracta en la que se empleara el manejo de direcciones (ordenes) a los jugadores de futbol
 */
package Logica;

/**
 *
 * @author David Santos
 */
public abstract class Handler {
    //Atributos
    private Handler mandar;
    private String nombres;

    public Handler(String nombre) {
        nombres = nombre;
        mandar = null;
    }
    public void setInstruccion (Handler instruccion){
        mandar = instruccion;
     }
    public String toString() {
        return nombres;
    }
    public String orden() {
        return (mandar != null ? mandar.orden() : "sin instruccion");
    }
    
    
}
