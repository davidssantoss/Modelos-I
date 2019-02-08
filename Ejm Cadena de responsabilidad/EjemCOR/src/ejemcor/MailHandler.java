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
public abstract class MailHandler {
    protected MailHandler nextHandler;

    public MailHandler(MailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handle();
    
}
