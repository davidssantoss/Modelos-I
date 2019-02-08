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
public class Teniente extends Unidad{
    private String estOrden;
    
    public Teniente(String nombre, String orden) {
        super(nombre);
        estOrden = orden;        
    }
    /* refinamiento del servicio que utiliza la cadena de responsabilidad, resolviendo
       localmente si tiene órdenes específicas o comportándose convencionalmente en
       caso contrario */

    public String orden() {
        return (estOrden != null ? estOrden : super.orden());
    }

    public String toString() {
        return ("Teniente " + super.toString());
    }

    
    
}
