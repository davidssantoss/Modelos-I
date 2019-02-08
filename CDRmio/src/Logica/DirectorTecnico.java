/*
 * Es una de las clases concretas del handler
 */
package Logica;

/**
 *
 * @author estudiantes
 */
public class DirectorTecnico extends Handler{
    private String mandar;

    public DirectorTecnico(String nombre, String mandar) {
        super(nombre);
        this.mandar = mandar;
    }
    public String orden() {
        return (mandar != null ? mandar : super.orden());
    }
    
    public String toString() {
        return ("Carlos Quieroz " + super.toString());
    }
    
}
