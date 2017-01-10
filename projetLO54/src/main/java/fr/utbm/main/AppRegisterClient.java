package fr.utbm.main;

import fr.utbm.controller.DefaultClientController;
import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.javabeans.CourseSession;

/**
 *
 * Fonction main qui enregistre un Client en base
 */
public class AppRegisterClient {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultCourseSessionController defCourseSessionController=new DefaultCourseSessionController();
        CourseSession courseSession=defCourseSessionController.getCourseSession(1);
        
        DefaultClientController DCC = new DefaultClientController();
        DCC.registerClient("John","Doe", "5, rue de Belfort", "11111111","john.doe@memet.com",courseSession);
    }
}
