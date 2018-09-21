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
public class ServicioPlus {
    public void pedirComida(int cantidad, int tipo){
        int total;
        int desayuno = 6000;
        int almuerzo = 12000;
        int cena = 10000;
        int comEsp = 20000;
        //se determinara dependiendo de la cantidad el valor de esta
        //Los tipos de comida son 1:Desayuno, 2:Almuerzo, 3:Cena, 4:comidas especiales
        switch (tipo){
            case 1:
                //El valor del desayuno costara 6000
                total = cantidad * desayuno;
                System.out.println("El valor de su pedido es: " + total);
                break;
            case 2:
                //El valor del almuerzo costara 12000
                total = cantidad * almuerzo;
                System.out.println("El valor de su pedido es: " + total);
                break;
            case 3:
                //El valor de la cena costara 10000
                total = cantidad * cena;
                System.out.println("El valor de su pedido es: " + total);
                break;
            case 4:
                //El valor de comidas especiales costara 20000
                total = cantidad * comEsp;
                System.out.println("El valor de su pedido es: " + total);
                break;
           default:
               System.out.println("No es correcta la entrada");                
        }
        
    }
    
}
