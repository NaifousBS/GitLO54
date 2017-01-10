package fr.utbm.main;

import fr.utbm.controller.DefaultMailController;

/**
 * Fonction main qui va envoyer un mail à un destinataire donné
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
