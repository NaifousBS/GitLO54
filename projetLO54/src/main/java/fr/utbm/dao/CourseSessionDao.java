package fr.utbm.dao;

import fr.utbm.javabeans.CourseSession;
import fr.utbm.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

// DAO de CourseSession
public class CourseSessionDao {
    
    /**
     * Enregistre un CourseSession dans la base de données
     *
     * @param newCourseSession
     */
    public void save(CourseSession newCourseSession){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(newCourseSession);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Récupère un CourseSession à partir de courseSessionId
     *
     * @param courseSessionId
     * @return
     */
    public CourseSession getCourseSession(int courseSessionId){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Retrieve a record
        CourseSession courseSessionSelect=(CourseSession) session.get(CourseSession.class,courseSessionId);
        session.close();
        return courseSessionSelect;
    }
    
    /**
     * Récupère une liste de CourseSession à partir du courseCode
     *
     * @param courseCode
     * @return
     */
    public List<CourseSession> getCourseSessions(String courseCode){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Query query = session.createQuery("from CourseSession c");
        Query query = session.createQuery("from CourseSession cs "
                + "where cs.course.code like :code");
        query.setParameter("code", courseCode);
        List<CourseSession> list= query.list();
        session.close();
        
        return list;
    }
    
    /**
     * Récupération d'une liste de tous les CourseSessions
     *
     * @return
     */
    public List<CourseSession> getAllCourseSessions(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Query query = session.createQuery("from CourseSession c");
        Query query = session.createQuery("from CourseSession cs ");
        List<CourseSession> list= query.list();
        session.close();
        
        return list;
    }
    
    /**
     * Récupération d'une liste de CourseSession avec filtre sur courseTitle, courseDate et courseLocation
     *
     * @param courseTitle
     * @param courseDate
     * @param courseLocation
     * @return
     */
    public List<CourseSession> getCourseSessionFiltre(String courseTitle,Date courseDate,String courseLocation)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        String request = "FROM CourseSession cs "
                + " WHERE cs.course.title like :title "
                + " AND cs.location.city like :city";
        if(courseDate!=null)
            request+= " AND cs.startDate like :date ";
        //Query query = session.createQuery("from CourseSession c");
        Query query = session.createQuery(request);
        query.setParameter("title", "%"+courseTitle+"%");
        query.setParameter("city", courseLocation+"%");
        if(courseDate!=null)
            query.setParameter("date", courseDate);
        List<CourseSession> list= query.list();
        session.close();
        
        return list;
        
    }
}
