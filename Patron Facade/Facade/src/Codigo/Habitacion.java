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
public class Habitacion {
    public void estado(boolean est){
        //Estado de la habitacion ocupada o libre
        if(est == true){
            System.out.println("La habitacion se encuentra ocuapa, lo siento D:");
        }else{
            System.out.println("La habitacion se encuentra libre :D ");
        }
    }
    
}
