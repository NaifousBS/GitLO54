package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;
import fr.utbm.javabeans.Course;
import java.util.List;

/**
 * Fonction main qui récupère une liste de Courses d'un Client donné à partir de son adresse mail
 * Ici il est compliqué de mettre cela en place car un id ou un mail peuvent correspondre à
 * plusieurs clients et donc on va récupérer une liste de cours où il peut y avoir des doublons.
 *
 */
public class AppGetCoursesFromClient {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultCourseController DCC = new DefaultCourseController();
        String emailClient = "soufian.besbiss@gmail.com";
        List<Course> clientCourses = DCC.getCoursesFromClient(emailClient);
        
        for(Course course : clientCourses){
            System.out.println(course.getTitle());
        }
    }
    
}
