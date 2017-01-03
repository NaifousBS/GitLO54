/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.service;

import fr.utbm.dao.MailDao;

/**
 *
 * Service de mails
 */
public class MailService {
    
    // Service d'envoi de mail
    public void sendMail(String destinataire, String subject, String messageText){
        MailDao MD = new MailDao();
        MD.sendmail(destinataire, subject, messageText);
    }
    
}
