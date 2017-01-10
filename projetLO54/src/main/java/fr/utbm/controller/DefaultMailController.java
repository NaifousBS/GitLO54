package fr.utbm.controller;

import fr.utbm.service.MailService;

// Contrôleur par défaut de Mails
public class DefaultMailController {
    
    /**
     * Envoi d'un mail vers un destinataire avec le sujet et un message texte
     *
     * @param destinataire
     * @param subject
     * @param messageText
     */
    public void sendMail(String destinataire, String subject, String messageText){
        MailService MS = new MailService();
        MS.sendMail(destinataire, subject, messageText);
    }
    
}
