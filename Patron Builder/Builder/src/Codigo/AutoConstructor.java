/*
 * Clase abstracta builder
 */
package Codigo;

/**
 *
 * @author David
 */
public abstract class AutoConstructor {
    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }
    
    public void crearAuto(){
        auto = new Auto();
    }
    public abstract void buildMotor();
    
    public abstract void buildModelo();
    
    public abstract void buildMarca();
    
    public abstract void buildPuertas();
}
