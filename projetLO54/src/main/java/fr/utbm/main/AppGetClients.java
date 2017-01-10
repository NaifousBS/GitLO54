package fr.utbm.main;

import fr.utbm.controller.DefaultClientController;
import fr.utbm.javabeans.Client;
import java.util.List;

/**
 *
 * Fonction main qui récupère une liste de clients
 */
public class AppGetClients {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultClientController DCC = new DefaultClientController();
        // Récupération de la liste de clients enregistrés
        List<Client> clientsList = DCC.getClients();
        // Affichage de la liste de clients
        System.out.println("Liste de clients : ");
        for(Client client : clientsList){
            System.out.println("Id : " + client.getId() + " - Nom : " + client.getLastname()
                    + " - Email : " + client.getEmail());
        }
    }
    
}
