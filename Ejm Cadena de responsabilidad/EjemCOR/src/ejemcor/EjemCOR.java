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
public class EjemCOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpamHandler spam = new SpamHandler(null);
        FanMailHandler fanmail = new FanMailHandler(spam);
        SalesHandler sales = new SalesHandler(fanmail);
        MailServer ms = new MailServer();
        ms.setHandler(sales);
        ms.processMails();
    }
    
}
