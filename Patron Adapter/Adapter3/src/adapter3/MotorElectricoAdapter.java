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
public class MotorElectricoAdapter extends Motor{
    MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("\tCreando motor Electrico adapter");
    }

    @Override
    public void encender() {
        System.out.println("\tEncendiendo motorElectricoAdapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("\tAcelerando motor electrico...");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("\tApagando motor electrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
    
}
