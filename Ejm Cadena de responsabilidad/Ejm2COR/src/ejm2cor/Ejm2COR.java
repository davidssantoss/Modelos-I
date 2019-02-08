/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm2cor;

/**
 *
 * @author estudiantes
 */
public class Ejm2COR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Unidad smith = new Coronel("Smith", null);
        Unidad truman = new Coronel("Truman", "Teniente organice el ataque de los soldados!");
        Unidad diaz = new Teniente("Diaz", "Ataquen!");
        Unidad ryan = new Soldado("Ryan");
        Unidad rambo = new Soldado("Rambo");
        
        /*
        System.out.println(smith.toString());                
        System.out.println(truman.toString());
        System.out.println(diaz.toString());
        System.out.println(ryan.toString());
        System.out.println(rambo.toString());
        */
        diaz.establecerMando(truman);
        System.out.println("Atencion soldados " + diaz.orden());     // Diaz -> Truman

        rambo.establecerMando(diaz);
        System.out.println(rambo.orden());    // rambo -> diaz -> truman

        ryan.establecerMando(rambo);
        System.out.println(ryan.orden());     // ryan -> rambo -> diaz -> truman
    }
    
}
