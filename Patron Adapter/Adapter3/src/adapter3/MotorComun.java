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
public class MotorComun extends Motor{

    public MotorComun() {
        super();
        System.out.println("\tCreando el motor comun");
    }
    

    @Override
    public void encender() {
        System.out.println("\tEncendiendo motor comun");    
    }

    @Override
    public void acelerar() {
        System.out.println("\tAcelerando el motor comun");    
    }

    @Override
    public void apagar() {
        System.out.println("\tApagando motor comun");    
    }
    
}
