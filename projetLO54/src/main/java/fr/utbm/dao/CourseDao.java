package fr.utbm.dao;

import java.util.List;

import fr.utbm.javabeans.Course;
import fr.utbm.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class CourseDao {

	public void save(Course newCourse){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(newCourse);
            session.getTransaction().commit();
            session.close();
	}
	
	public Course getCourse(String courseId){
            Session session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            //Retrieve a record
            Course courseSelect=(Course) session.get(Course.class,courseId);
            session.close();
            return courseSelect;
	}
	public List<Course> getCourses(){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from Course c");
            List<Course> list= query.list();
            session.close();

            return list;
	}
}
