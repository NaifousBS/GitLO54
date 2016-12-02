/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.main;

import fr.utbm.controller.DefaultLocationController;
import fr.utbm.javabeans.Location;
import java.util.List;

/**
 *
 * @author Ahmet
 */
public class AppGetLocations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultLocationController defLocationController=new DefaultLocationController();
        List<Location> listLocations= defLocationController.getLocations();
        for(int i=0; i<listLocations.size();i++)
            System.out.println(listLocations.get(i).getCity());
        
    }
    
}
