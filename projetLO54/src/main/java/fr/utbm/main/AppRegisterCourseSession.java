package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;
import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.controller.DefaultLocationController;
import fr.utbm.javabeans.Course;
import fr.utbm.javabeans.Location;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fonction main qui enregistre un CourseSession en base
 */
public class AppRegisterCourseSession {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DefaultCourseController defCourseController=new DefaultCourseController();
        Course course=defCourseController.getCourse("C0002");
        
        DefaultLocationController defLocationController=new DefaultLocationController();
        Location location=defLocationController.getLocation(2);
        Date startDate=null;
        Date endDate=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = sdf.parse("06/01/2017");
            endDate = sdf.parse("12/01/2017");
        } catch (ParseException ex) {
            Logger.getLogger(AppRegisterCourseSession.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultCourseSessionController defCourseSessionController=new DefaultCourseSessionController();
        defCourseSessionController.registerCourseSession(startDate,endDate,course,location);
    }
    
}
