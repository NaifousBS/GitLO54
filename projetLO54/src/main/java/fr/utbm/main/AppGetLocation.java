package fr.utbm.main;

import fr.utbm.controller.DefaultLocationController;

/**
 * Fonction main qui récupère un Location à partir de son id
 */
public class AppGetLocation {
    
    public static void main(String[] args) {
        
        DefaultLocationController defLocationController=new DefaultLocationController();
        System.out.println(defLocationController.getLocation(1).getCity());
    }
    
}
