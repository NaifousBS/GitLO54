package fr.utbm.main;

import fr.utbm.controller.DefaultLocationController;

/**
 * Fonction main qui enregsitre un Location en base
 */
public class AppRegisterLocation {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultLocationController defLocationController=new DefaultLocationController();
        defLocationController.registerLocation("Antalya");
    }
    
}
