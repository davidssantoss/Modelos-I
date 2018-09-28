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
public class FiatConstructor extends AutoConstructor{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(798797);
        motor.setPotencia("50 HP");
        auto.setMotor(motor);

    }

    @Override
    public void buildModelo() {
        auto.setModelo("Strada Adventure");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(6);
    }
    
}
