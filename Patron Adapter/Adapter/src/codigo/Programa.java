/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Estudiantes
 */
public class Programa {
    
    public static void main(String[] args) {
        AACAdapter adapter = new AACAdapter();
        PlayAAC(adapter);
    }
    static void PlayAAC(Plugin p){
        p.decode();
    }
    
}
