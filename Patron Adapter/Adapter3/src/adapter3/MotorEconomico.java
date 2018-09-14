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
public class MotorEconomico extends Motor{

    public MotorEconomico() {
        super();
        System.out.println("\tCreando el motor economico");
    }
    

    @Override
    public void encender() {
        System.out.println("\tEncendiendo motor economico");
    }

    @Override
    public void acelerar() {
        System.out.println("\tAcelerando el motor economico");
    }

    @Override
    public void apagar() {
        System.out.println("\tApagando motor economico");
    }
    
}
