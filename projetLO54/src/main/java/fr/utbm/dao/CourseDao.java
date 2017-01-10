package fr.utbm.dao;

import fr.utbm.javabeans.Course;
import fr.utbm.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

// DAO de Course
public class CourseDao {
    
    /**
     * Enregistre un cours dans la base de données
     *
     * @param newCourse
     */
    public void save(Course newCourse){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(newCourse);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Récupère un cours à partir de son id
     *
     * @param courseId
     * @return
     */
    public Course getCourse(String courseId){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Retrieve a record
        Course courseSelect=(Course) session.get(Course.class,courseId);
        session.close();
        return courseSelect;
    }
    
    /**
     * Récupère la liste de tous les cours disponibles
     *
     * @return
     */
    public List<Course> getCourses(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Course c");
        List<Course> list= query.list();
        session.close();
        return list;
    }
    
    /**
     * Récupère une liste des cours auxquels est inscrit un client à partir de son adresse mail
     *
     * @param emailClient
     * @return
     */
    public List<Course> getCoursesFromClient(String emailClient){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query =  session.createQuery(
                "SELECT cou.title "
                        + "FROM Client as cli "
                        + "inner join cli.courseSession as cs "
                        + "inner join cs.course as cou "
                        + "WHERE cli.email = :emailClient");
        query.setParameter("emailClient", emailClient);
        List<Course> list = query.list();
        session.close();
        return list;
    }
}
