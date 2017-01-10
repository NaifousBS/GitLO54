package fr.utbm.main;

import fr.utbm.controller.DefaultClientController;

/**
 *
 * Fonction main qui récupère un client renseigné par son id
 */
public class AppGetClient {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultClientController DCC = new DefaultClientController();
        System.out.println(DCC.getClient(1).getFirstname()
                + " " + DCC.getClient(1).getLastname()
                + " " + DCC.getClient(1).getEmail());
    }
}
