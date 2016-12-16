/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.controller;

import fr.utbm.service.MailService;

/**
 *
 * @author Souf
 */
public class DefaultMailController {
    
    public void sendMail(String destinataire, String subject, String messageText){
        MailService MS = new MailService();
        MS.sendMail(destinataire, subject, messageText);
    }
    
}
