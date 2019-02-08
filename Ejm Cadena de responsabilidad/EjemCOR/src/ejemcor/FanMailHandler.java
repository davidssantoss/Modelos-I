/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemcor;

/**
 *
 * @author estudiantes
 */
public class FanMailHandler extends MailHandler{

    public FanMailHandler(MailHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle() {
        System.out.println("[FanMailHandler] handle");
        if (nextHandler == null) {
            System.out.println("End of chain");            
        }else{
            nextHandler.handle();
        } 
        
    }
    
}
