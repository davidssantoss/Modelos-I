/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm2cor;

/**
 *
 * @author estudiantes
 */
public abstract class Unidad {
    //Atributos
    private Unidad estOrden;
    private String nombres;
    
    public Unidad(String nombre) {
        estOrden = null;
        nombres = nombre;
    }

    public String toString() {
        return nombres;
    }

    // cambia el mando de una unidad (modifica cadena de responsabilidad)
    public void establecerMando(Unidad mando) {
        estOrden = mando;
    }

    /* comportamiento por defecto de la cadena: delegar en el mando directo o, si se 
       alcanza el final de la cadena, utilizar una resolución por defecto (sin orden) */
    public String orden() {
        return (estOrden != null ? estOrden.orden() : "(sin orden)");
    }

    

    
}
