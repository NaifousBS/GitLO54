/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.main;

import fr.utbm.controller.DefaultClientController;

/**
 *
 * Récupère un client renseigné par son id
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
