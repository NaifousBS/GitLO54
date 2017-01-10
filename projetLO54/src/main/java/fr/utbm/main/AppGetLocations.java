package fr.utbm.main;

import fr.utbm.controller.DefaultLocationController;
import fr.utbm.javabeans.Location;
import java.util.List;

/**
 * Fonction main qui récupère une liste de Locations
 */
public class AppGetLocations {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultLocationController defLocationController=new DefaultLocationController();
        List<Location> listLocations= defLocationController.getLocations();
        for(int i=0; i<listLocations.size();i++)
            System.out.println(listLocations.get(i).getCity());
        
    }
    
}
