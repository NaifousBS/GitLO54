package fr.utbm.controller;

import fr.utbm.javabeans.Location;
import fr.utbm.service.LocationService;
import java.util.List;

// Contrôleur par défaut du bean Location
public class DefaultLocationController {
    
    /**
     * Enregistrement d'un Location
     *
     * @param city
     */
    public void registerLocation(String city){
        // Instanciation de location
        Location locationToRegister = new Location();
        locationToRegister.setCity(city);
        // Ajout en base
        LocationService locationService = new LocationService();
        locationService.registerLocation(locationToRegister);
    }
    
    /**
     * Récupération d'une liste de tous les Locations
     *
     * @return
     */
    public List<Location> getLocations(){
        LocationService locationService = new LocationService();
        List<Location> listLocations= locationService.getLocations();
        return listLocations;
    }
    
    /**
     * Récupération d'un Location à partir de locationId
     *
     * @param locationId
     * @return
     */
    public Location getLocation(int locationId){
        LocationService locationService = new LocationService();
        Location locationSelect= locationService.getLocation(locationId);
        return locationSelect;
    }
    
}
