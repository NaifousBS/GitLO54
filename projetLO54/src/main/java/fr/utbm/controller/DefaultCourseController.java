package fr.utbm.controller;

import java.util.List;

import fr.utbm.javabeans.Course;
import fr.utbm.service.CourseService;

public class DefaultCourseController {
    public void registerCourse(String code, String title){
        // Instanciation de location
        Course courseToRegister = new Course();
        courseToRegister.setCode(code);
        courseToRegister.setTitle(title);
        // Ajout en base
        CourseService courseService = new CourseService();
        courseService.registerCourse(courseToRegister);
    }
    public List<Course> getCourses(){
        CourseService locationService = new CourseService();
        List<Course> listCourses= locationService.getCourses();
        return listCourses;
    }
    public Course getCourse(String courseId){
        CourseService courseService = new CourseService();
        Course courseSelect= courseService.getCourse(courseId);
        return courseSelect;
    }

}
