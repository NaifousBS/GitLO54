/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package fr.utbm.main;

import fr.utbm.controller.DefaultMailController;

/**
 *
 * @author Souf
 */
public class AppSendMail {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultMailController DMC = new DefaultMailController();
        String destinataire = "soufian.besbiss@gmail.com";
        String subject = "Sujet";
        String messageText = "Test";
        DMC.sendMail(destinataire, subject, messageText);
    }
    
}
