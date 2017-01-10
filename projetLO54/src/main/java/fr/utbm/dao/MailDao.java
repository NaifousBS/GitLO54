/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package fr.utbm.dao;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * DAO Mail
 */
public class MailDao {
    
    /**
     * Méthode d'envoi de mail
     *
     * @param destinataire
     * @param subject
     * @param messageText
     */
    public void sendmail(String destinataire, String subject, String messageText){
        Properties props = new Properties();
        // On indique les propriétés du Transport pour l'envoi du mail
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        // On renseigne les données pour l'authentification
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("serious.game90@gmail.com","AdminUTBM90");
                    }
                });
        
        try {
            // Création d'un nouveau message (mail)
            Message message = new MimeMessage(session);
            // On renseigne l'expéditeur du mail
            message.setFrom(new InternetAddress("LO54@exemple.com"));
            // On renseigne le destinataire du mail
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(destinataire));
            // On renseigne l'objet du mail
            message.setSubject(subject);
            // On renseigne le message texte du mail
            message.setText(messageText);
            
            // Envoi du mail
            Transport.send(message);
            // Log OK
            System.out.println("Mail successfully sent!");
            
        } catch (MessagingException e) {
            // Log KO
            System.out.println("Problem while sending the mail! Exception : " + e + "/nMessage : " + e.getMessage());
            throw new RuntimeException(e);
        }
        
    }
}
