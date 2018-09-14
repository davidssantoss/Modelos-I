/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args) {
        Gorrion gorrion = new Gorrion();
        PatodePlastico pp = new PatodePlastico();
//        Convierte un pajaro en el pajaroAdapter para que se comporte como un PatodePlastico
        PatodeGoma pajaroAdapter = new PajaroAdapter(gorrion);
        
        
        System.out.println(" Gorrion ... ");
        gorrion.volar();
        gorrion.hacerSonido();
        
        System.out.println("PajaroAdapter ... ");
        pajaroAdapter.sonar();
        
    }
    
}
