package fr.utbm.main;

import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.javabeans.CourseSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Fonction main qui récupère une liste de CourseSessions
 */
public class AppGetCourseSessions {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date courseDate=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            courseDate = sdf.parse("");
            
        } catch (ParseException ex) {
        }
        DefaultCourseSessionController DCSC = new DefaultCourseSessionController();
        
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
