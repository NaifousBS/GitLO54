package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;

/**
 * Fonction main qui récupère un Course renseigné par le code
 */
public class AppGetCourse {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultCourseController defCourseController=new DefaultCourseController();
        System.out.println(defCourseController.getCourse("C0001").getTitle());
    }
    
}
