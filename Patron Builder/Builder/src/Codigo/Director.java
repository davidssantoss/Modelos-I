/*
 * Clase Director
 */
package Codigo;

/**
 *
 * @author Estudiantes
 */
public class Director {
    private AutoConstructor autoConstructor;
    public void construirAuto(){
        autoConstructor.crearAuto();
        autoConstructor.buildMarca();
        autoConstructor.buildModelo();
        autoConstructor.buildMotor();
        autoConstructor.buildPuertas();
    }

    public Auto getAuto() {
        return autoConstructor.getAuto();
    }

    public void setAutoConstructor(AutoConstructor autoConstructor) {
        this.autoConstructor = autoConstructor;
    }
     
    
}
