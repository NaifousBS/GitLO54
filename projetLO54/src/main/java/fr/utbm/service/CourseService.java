package fr.utbm.service;

import fr.utbm.dao.CourseDao;
import fr.utbm.javabeans.Course;
import java.util.List;

// Service de Course
public class CourseService {
    
    /**
     * Enregistrement d'un Course
     *
     * @param newCourse
     */
    public void registerCourse(Course newCourse)
    {
        CourseDao courseDao=new CourseDao();
        courseDao.save(newCourse);
    }
    
    /**
     * Récupération d'une liste de tous les Course
     *
     * @return
     */
    public List<Course> getCourses()
    {
        CourseDao courseDao=new CourseDao();
        return courseDao.getCourses();
    }
    
    /**
     * Récupération d'un Course à partir de son courseId
     *
     * @param courseId
     * @return
     */
    public Course getCourse(String courseId)
    {
        CourseDao courseDao=new CourseDao();
        return courseDao.getCourse(courseId);
    }
    
    /**
     * Récupération d'une liste de Courses à partir de emailClient
     *
     * @param emailClient
     * @return
     */
    public List<Course> getCoursesFromClient(String emailClient){
        CourseDao CD = new CourseDao();
        List<Course> list = CD.getCoursesFromClient(emailClient);
        return list;
    }
}
