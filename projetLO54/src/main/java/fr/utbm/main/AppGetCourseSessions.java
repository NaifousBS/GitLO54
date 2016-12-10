/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.main;

import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.javabeans.CourseSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmet
 */
public class AppGetCourseSessions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*DefaultCourseSessionController defCourseSessionController=new DefaultCourseSessionController();
        List<CourseSession> listCourseSessions= defCourseSessionController.getCourseSessions("C0001");
        */
        Date courseDate=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            courseDate = sdf.parse("");
            
        } catch (ParseException ex) {
        }
        DefaultCourseSessionController DCSC = new DefaultCourseSessionController();
            //List<CourseSession> listeCourseSessions = DCSC.getAllCourseSessions();
            List<CourseSession> listCourseSessions = DCSC.getCourseSessionFiltre("",courseDate,"Istanbul");
        
        
        
        for(int i=0; i<listCourseSessions.size();i++)
            System.out.println(listCourseSessions.get(i).getId()+" "
                    +listCourseSessions.get(i).getCourse().getTitle()+" "
                    +listCourseSessions.get(i).getStartDate()+" "
                    +listCourseSessions.get(i).getEndDate()+" "
                    +listCourseSessions.get(i).getLocation().getCity()+" "
                    );
    }
    
}
