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
public class Soldado extends Unidad{
    // el constructor sólo tiene que inicializar la parte correspondiente a la superclase

    public Soldado(String nombre) {
        super(nombre);
    }

    public String toString() {
        return ("Soldado " + super.toString());
    }
    
}
