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
public class AACAdapter extends Plugin{
    private AACDecoder decoder = new AACDecoder();

    @Override
    public void decode() {
        System.out.println("[AACAdapter] Decode");
    }
    
    
}
