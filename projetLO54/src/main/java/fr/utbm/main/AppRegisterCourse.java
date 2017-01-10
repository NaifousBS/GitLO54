package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;

/**
 * Fonction main qui enregistre un Cours en base
 */
public class AppRegisterCourse {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultCourseController defCourseController=new DefaultCourseController();
        defCourseController.registerCourse("C0002","C#.Net");
    }
    
}
