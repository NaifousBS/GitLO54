package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;
import fr.utbm.javabeans.Course;
import java.util.List;

/**
 * Fonction main qui récupère une liste de Courses
 */
public class AppGetCourses {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultCourseController defCourseController=new DefaultCourseController();
        List<Course> listCourses= defCourseController.getCourses();
        for(int i=0; i<listCourses.size();i++)
            System.out.println(listCourses.get(i).getTitle());
    }
    
}
