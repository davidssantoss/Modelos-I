/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter3;

/**
 *
 * @author Estudiantes
 */
public class Aplicacion {
    Motor motor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion a = new Aplicacion();
        System.out.println("******************Motor Comun*********************");
        a.usarMotorComun();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Economico******************");
        a.usarMotorEconomico();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Electrico******************");
        a.usarMotorElectrico();
        System.out.println("**************************************************\n");
        
        
    }
    
    private void usarMotorComun() {
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorElectrico() {
        motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorEconomico() {
        motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
    
}
