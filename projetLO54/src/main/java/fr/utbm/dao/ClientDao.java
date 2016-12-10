package fr.utbm.dao;

import fr.utbm.javabeans.Client;
import fr.utbm.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClientDao {
    
    // Méthode de création d'un nouveau client avec connexion à la base
    public void save(Client newClient){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(newClient);
            session.getTransaction().commit();
            System.out.println("Client créé!");
            session.close();
        } catch (Exception e){
            System.out.println("Erreur lors de la création du client!");
        }
    }

    
    // Méthode qui récupère un client renseigné par son ID
    public Client getClient(int idClient){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Client clientSelect=(Client)session.get(Client.class,idClient);
        session.close();
        return clientSelect;
    }
    
    // Méthode qui récupère une liste de clients
    public List<Client> getClients(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Client");
        List<Client> list = query.list();
        session.close();
        return list;
    }
}
