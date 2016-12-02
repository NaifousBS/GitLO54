package fr.utbm.service;

import java.util.List;

import fr.utbm.dao.LocationDao;
import fr.utbm.javabeans.Location;

public class LocationService {
	public void registerLocation(Location newLocation)
	{
		LocationDao locDao=new LocationDao();
		locDao.save(newLocation);
	}
	public List<Location> getLocations()
	{
		LocationDao locDao=new LocationDao();
		return locDao.getLocations();
	}
	public Location getLocation(int locId)
	{
		LocationDao locDao=new LocationDao();
		return locDao.getLocation(locId);
	}
}
