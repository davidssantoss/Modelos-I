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
public class PorscheConstructor extends AutoConstructor{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(4652135);
        motor.setPotencia("100 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Carrera 911");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Porsche");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(2);
    }
    
}
