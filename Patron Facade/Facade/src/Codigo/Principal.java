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
public class Principal {
    public static void main(String[] args) {
        SistemaHotel sh = new SistemaHotel();
        Cliente c = new Cliente();
        Recepcionista r = new Recepcionista();
        Admin a = new Admin();
        
        sh.funciones(a);
        sh.funciones(c);
        
        
        
    }
    
}
