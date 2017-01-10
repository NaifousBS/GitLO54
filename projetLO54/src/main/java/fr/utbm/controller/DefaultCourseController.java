package fr.utbm.controller;

import fr.utbm.javabeans.Course;
import fr.utbm.service.CourseService;
import java.util.List;

// Contrôleur par défaut des cours
public class DefaultCourseController {
    // Enregistre un cours
    public void registerCourse(String code, String title){
        // Instanciation de location
        Course courseToRegister = new Course();
        courseToRegister.setCode(code);
        courseToRegister.setTitle(title);
        // Ajout en base
        CourseService courseService = new CourseService();
        courseService.registerCourse(courseToRegister);
    }
    // Récupère la liste de tous les cours
    public List<Course> getCourses(){
        CourseService courseService = new CourseService();
        List<Course> listCourses= courseService.getCourses();
        return listCourses;
    }
    // Récupère un cours à partir de son id
    public Course getCourse(String courseId){
        CourseService courseService = new CourseService();
        Course courseSelect= courseService.getCourse(courseId);
        return courseSelect;
    }
    // Récupère une liste de cours d'un client à partir de son email
    public List<Course> getCoursesFromClient(String emailClient){
        CourseService CS = new CourseService();
        List<Course> list = CS.getCoursesFromClient(emailClient);
        return list;
    }
    
}
