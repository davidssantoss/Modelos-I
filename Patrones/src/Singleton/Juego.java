package Singleton;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Juego {
    
    

    
    public static void main(String[] args) {
        Ogros shrek;
        Computadora pc ;
        Jugador pepito;
        Scanner sc;
        shrek = Ogros.getOgros();
        pc = new Computadora();
        pepito = new Jugador();
        sc= new Scanner(System.in);
        
        int disparos;
        
        do{
            System.out.println("digite el numero de balas a disparar: ");
            disparos = sc.nextInt();
            for (int i = 0; i < disparos ; i++) {
                pepito.destruirOgro();                
            }
            pc.creaOgros();
            shrek.ogrosRestantes();
        }while(disparos != 0);
        
    }
    
}
