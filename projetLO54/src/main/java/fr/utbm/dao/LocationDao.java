package fr.utbm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import fr.utbm.javabeans.Location;
import fr.utbm.util.HibernateUtil;

public class LocationDao {

	public void save(Location loc){
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
       /* Movie movie=new Movie();
        movie.setTitle(p_movie.getTitle());
        movie.setType(p_movie.getType());
        movie.setNumCopies(p_movie.getNumCopies());*/
        session.save(loc);
        session.getTransaction().commit();
        session.close();
	}
	
	public Location getLocation(int locationId){
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
        //Retrieve a record
		Location locationSelect=(Location) session.get(Location.class,locationId);
        session.close();
        return locationSelect;
	}
	public List<Location> getLocations(){
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Location l");
        List<Location> list= query.list();
        session.close();
        
        return list;
	}
}
