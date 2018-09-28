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
        Director d = new Director();
        Director d2 = new Director();
        d.setAutoConstructor(new PorscheConstructor());
        d2.setAutoConstructor(new ChevroletConstructor());
        d.construirAuto();
        d2.construirAuto();
        
        Auto auto = d.getAuto();
        Auto auto2 = d2.getAuto();
        
        System.out.println("\t\tPrimer auto");
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.getCantidadDePuertas());
        System.out.println(auto.getMotor().getNumero());
        System.out.println(auto.getMotor().getPotencia());
        
        System.out.println("\n===================================================");
        
        System.out.println("\n\t\tSegundo auto");
        System.out.println(auto2.getMarca());
        System.out.println(auto2.getModelo());
        System.out.println(auto2.getCantidadDePuertas());
        System.out.println(auto2.getMotor().getNumero());
        System.out.println(auto2.getMotor().getPotencia());
    }
    
}
