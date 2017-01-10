package fr.utbm.service;

import fr.utbm.dao.ClientDao;
import fr.utbm.javabeans.Client;
import java.util.List;

// Service de Client
public class ClientService {
    // Instanciation d'un nouveau ClientDao
    ClientDao clientDao=new ClientDao();
    
    /**
     * Récupération d'une liste de tous les Clients
     *
     * @return
     */
    public List<Client> getClients()
    {
        return clientDao.getClients();
    }
    
    /**
     * Récupération d'un Client à partir de son clientId
     *
     * @param clientId
     * @return
     */
    public Client getClient(int clientId) {
        return clientDao.getClient(clientId);
    }
    
    /**
     * Enregistrement d'un Client
     *
     * @param client
     */
    public void registerClient(Client client) {
        clientDao.save(client);
    }
}
