package fr.utbm.service;

import fr.utbm.dao.LocationDao;
import fr.utbm.javabeans.Location;
import java.util.List;

// Service de Location
public class LocationService {
    
        /**
         * Enregistrement d'un Location
         * 
         * @param newLocation 
         */
	public void registerLocation(Location newLocation)
	{
            LocationDao locDao=new LocationDao();
            locDao.save(newLocation);
	}
        
        /**
         * Récupération d'une liste de tous les Location
         * 
         * @return 
         */
	public List<Location> getLocations()
	{
            LocationDao locDao=new LocationDao();
            return locDao.getLocations();
	}
        
        /**
         * Récupération d'un Location à partir de son locId
         * 
         * @param locId
         * @return 
         */
	public Location getLocation(int locId)
	{
            LocationDao locDao=new LocationDao();
            return locDao.getLocation(locId);
	}
}
