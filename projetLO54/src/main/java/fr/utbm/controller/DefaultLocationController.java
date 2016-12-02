package fr.utbm.controller;

import java.util.List;

import fr.utbm.javabeans.Location;
import fr.utbm.service.LocationService;

public class DefaultLocationController {
	public void registerLocation(){
		
	}
	public List<Location> getLocations(){
		return null;
	}
	public Location getLocation(int locationId){
		LocationService locationService = new LocationService();
		Location locationSelect= locationService.getLocation(locationId);
		return locationSelect;
	}

}
