/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;
import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.controller.DefaultLocationController;
import fr.utbm.javabeans.Course;
import fr.utbm.javabeans.Location;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmet
 */
public class AppRegisterCourseSession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultCourseController defCourseController=new DefaultCourseController();
        Course course=defCourseController.getCourse("C0001");
        
        DefaultLocationController defLocationController=new DefaultLocationController();
        Location location=defLocationController.getLocation(2);
        Date startDate=null;
        Date endDate=null; 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = sdf.parse("11/12/2016");
            endDate = sdf.parse("15/12/2016");
        } catch (ParseException ex) {
            Logger.getLogger(AppRegisterCourseSession.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultCourseSessionController defCourseSessionController=new DefaultCourseSessionController();
        defCourseSessionController.registerCourseSession(startDate,endDate,course,location);
    }
    
}
