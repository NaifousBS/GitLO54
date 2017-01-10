package fr.utbm.service;

import fr.utbm.dao.MailDao;

// Service de mails
public class MailService {
    
    /**
     * Méthode d'envoi de mail vers un destinataire avec le subject du mail et le messageText
     *
     * @param destinataire
     * @param subject
     * @param messageText
     */
    public void sendMail(String destinataire, String subject, String messageText){
        MailDao MD = new MailDao();
        MD.sendmail(destinataire, subject, messageText);
    }
    
}
