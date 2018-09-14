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
public class PajaroAdapter implements PatodeGoma{
//    Se implementa lo que el cliente espere usar
    Pajaro pajarito;
    PatodeGoma pp;

  
    

    public PajaroAdapter(Pajaro pajarito) {
        this.pajarito = pajarito;
    }
    
    

    @Override
    public void sonar() {
        pajarito.hacerSonido();       
    }
    
    
}
