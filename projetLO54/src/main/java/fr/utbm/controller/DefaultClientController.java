package fr.utbm.controller;

import fr.utbm.javabeans.Client;
import fr.utbm.javabeans.CourseSession;
import fr.utbm.service.ClientService;
import java.util.List;

// Contrôleur par défaut du bean Client
public class DefaultClientController {
    // On instancie un nouveau ClientService
    ClientService CS = new ClientService();
    
    /**
     * Enregistrement d'un nouveau client
     *
     * @param clientFirstname
     * @param clientLastname
     * @param clientAddress
     * @param clientPhone
     * @param clientEmail
     * @param clientCourseSession
     */
    public void registerClient(String clientFirstname, String clientLastname, String clientAddress, String clientPhone, String clientEmail, CourseSession clientCourseSession){
        // Création du client avec ses propriétés firstname et lastname
        Client client = new Client();
        client.setFirstname(clientFirstname);
        client.setLastname(clientLastname);
        client.setAddress(clientAddress);
        client.setPhone(clientPhone);
        client.setEmail(clientEmail);
        client.setCourseSession(clientCourseSession);
        
        // Enregistrement du client vers le service
        CS.registerClient(client);
    }
    
    /**
     * Récupération d'une liste de tous les clients
     *
     * @return
     */
    public List<Client> getClients(){
        return CS.getClients();
        
    }
    
    /**
     * Récupération d'un client à partir de son id
     *
     * @param clientId
     * @return
     */
    public Client getClient(int clientId){
        return CS.getClient(clientId);
    }
}
