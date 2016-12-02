package fr.utbm.service;

import fr.utbm.dao.ClientDao;
import fr.utbm.javabeans.Client;
import java.util.List;


public class ClientService {
    ClientDao clientDao=new ClientDao();

    public List<Client> getClients()
    {
        return clientDao.getClients();
    }
    
    public Client getClient(int clientId) {
        return clientDao.getClient(clientId);
    }

    // Service d'enregistrement de client vers le DAO
    public void registerClient(Client client) {
        clientDao.save(client);
    }
}
