package fr.utbm.service;

import fr.utbm.dao.CourseDao;
import fr.utbm.javabeans.Course;
import java.util.List;

// Service des cours
public class CourseService {
    // Enregistre un cours
    public void registerCourse(Course newCourse)
    {
        CourseDao courseDao=new CourseDao();
        courseDao.save(newCourse);
    }
    // Récupère une liste de tous les cours disponibles
    public List<Course> getCourses()
    {
        CourseDao courseDao=new CourseDao();
        return courseDao.getCourses();
    }
    // Récupère un cours à partir de son id
    public Course getCourse(String courseId)
    {
        CourseDao courseDao=new CourseDao();
        return courseDao.getCourse(courseId);
    }
    // Récupère une liste de cours à partir de l'email du client
    public List<Course> getCoursesFromClient(String emailClient){
        CourseDao CD = new CourseDao();
        List<Course> list = CD.getCoursesFromClient(emailClient);
        return list;
    }
}
