package fr.utbm.dao;

import java.util.List;

import fr.utbm.javabeans.CourseSession;
import fr.utbm.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;


public class CourseSessionDao {

	public void save(CourseSession newCourseSession){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(newCourseSession);
            session.getTransaction().commit();
            session.close();
	}
	
	public CourseSession getCourseSession(int courseSessionId){
            Session session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            //Retrieve a record
            CourseSession courseSessionSelect=(CourseSession) session.get(CourseSession.class,courseSessionId);
            session.close();
            return courseSessionSelect;
	}
	public List<CourseSession> getCourseSessions(){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from CourseSession c");
            List<CourseSession> list= query.list();
            session.close();

            return list;
	}
}
