package fr.utbm.controller;

import java.util.List;

import fr.utbm.javabeans.Location;
import fr.utbm.service.LocationService;

public class DefaultLocationController {
	public void registerLocation(String city){
            // Instanciation de location
            Location locationToRegister = new Location();
            locationToRegister.setCity(city);
            // Ajout en base
            LocationService locationService = new LocationService();
            locationService.registerLocation(locationToRegister);
	}
	public List<Location> getLocations(){
            LocationService locationService = new LocationService();
            List<Location> listLocations= locationService.getLocations();
            return listLocations;
	}
	public Location getLocation(int locationId){
            LocationService locationService = new LocationService();
            Location locationSelect= locationService.getLocation(locationId);
            return locationSelect;
	}

}
