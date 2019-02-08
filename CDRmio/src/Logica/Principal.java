/*
 * Esta sería la clase Cliente dentro de la plantilla del patro puesto que se asocia con la clase Handler
 */
package Logica;

/**
 *
 * @author David Santos
 */
public class Principal {
    public static void main(String[] args) {
        Handler queiroz = new DirectorTecnico("Carlos Queiroz","Usen la formacion 4-3-3");
        Handler james = new Jugadores("James Rodriguez");
        Handler falcao = new Jugadores("Radamel Falcao");
        Handler cuadrado = new Jugadores("Juan G. Cuadrado");
        
        //Instrucciones 
        System.out.println(falcao.orden()); // Al principio no tienen ninguna instruccion
        // Establecer las instrucciones por jerarquia
        
        james.setInstruccion(queiroz); // El director tecnico le asigna una instruccion al jugador James Rodriguez
        System.out.println(james.orden());
        
        cuadrado.setInstruccion(james);     //Ahora James que es el capitan informa a los demás integrantes la orden que dio el d.t. 
        System.out.println(cuadrado.orden());
        
        falcao.setInstruccion(cuadrado);    // Falcao no alcanzo a escuchar a james asi que acudio a cuadrado para saber la instruccion        
        System.out.println(falcao.orden());
                
        
        
    }
    
}
