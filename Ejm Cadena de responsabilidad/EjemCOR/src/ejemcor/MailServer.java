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
public class MailServer {
    MailHandler handler;
    public void setHandler (MailHandler handler){
        this.handler = handler;
    }
    public void processMails(){
        handler.handle();
    }
    
}
