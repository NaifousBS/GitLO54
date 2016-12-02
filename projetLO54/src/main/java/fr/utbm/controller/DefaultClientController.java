package fr.utbm.controller;

import fr.utbm.javabeans.Client;
import fr.utbm.service.ClientService;
import java.util.List;

public class DefaultClientController {
    ClientService CS = new ClientService();
    public void registerClient(String clientFirstname, String clientLastname, String clientAddress, String clientPhone){
        // Création du client avec ses propriétés firstname et lastname
        Client client = new Client();
        client.setFirstname(clientFirstname);
        client.setLastname(clientLastname);
        client.setAddress(clientAddress);
        client.setPhone(clientPhone);
        // Enregistrement du client vers le service
        CS.registerClient(client);
    }
    
    public List<Client> getClients(){
        return CS.getClients();
        
    }
    
    public Client getClient(int clientId){
        return CS.getClient(clientId);
    } 
}
