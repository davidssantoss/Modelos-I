/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author estudiantes
 */
public class Jugadores extends Handler{
    

    public Jugadores(String nombre) {
        super(nombre);        
    }
    public String toString() {
        return ("Jugadores " + super.toString());
    }
    
    
}
