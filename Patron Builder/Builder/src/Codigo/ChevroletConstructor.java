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
public class ChevroletConstructor extends AutoConstructor{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(46846);
        motor.setPotencia("20 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Corsa");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Chevrolet");
        
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(4);
    }
    
}
