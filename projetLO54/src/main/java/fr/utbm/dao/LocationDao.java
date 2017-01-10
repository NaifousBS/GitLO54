package fr.utbm.dao;

import fr.utbm.javabeans.Location;
import fr.utbm.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

// DAO de Location
public class LocationDao {
    
    /**
     * Enregistre un Location dans la base de données
     *
     * @param loc
     */
    public void save(Location loc){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(loc);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Récupère un Location à partir de locationId
     *
     * @param locationId
     * @return
     */
    public Location getLocation(int locationId){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Retrieve a record
        Location locationSelect=(Location) session.get(Location.class,locationId);
        session.close();
        return locationSelect;
    }
    
    /**
     * Récupère une liste de tous les Locations
     *
     * @return
     */
    public List<Location> getLocations(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Location l");
        List<Location> list= query.list();
        session.close();
        
        return list;
    }
}
