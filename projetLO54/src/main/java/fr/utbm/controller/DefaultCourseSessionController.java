package fr.utbm.controller;

import fr.utbm.javabeans.*;
import fr.utbm.service.CourseSessionService;
import java.util.Date;
import java.util.List;

// Contrôleur par défaut du bean CourseSession
public class DefaultCourseSessionController {
    
    /**
     *
     * Enregistrement d'un CourseSession
     * @param startDate
     * @param endDate
     * @param course
     * @param location
     */
    public void registerCourseSession(Date startDate, Date endDate,Course course, Location location){
        // Instanciation d'un CourseSession
        CourseSession courseSessionToRegister = new CourseSession();
        courseSessionToRegister.setStartDate(startDate);
        courseSessionToRegister.setEndDate(endDate);
        courseSessionToRegister.setCourse(course);
        courseSessionToRegister.setLocation(location);
        // Ajout en base
        CourseSessionService courseSessionService = new CourseSessionService();
        courseSessionService.registerCourseSession(courseSessionToRegister);
    }
    
    /**
     * Récupération d'une liste de CourseSessions à partir du courseCode
     *
     * @param courseCode
     * @return
     */
    public List<CourseSession> getCourseSessions(String courseCode){
        CourseSessionService courseSessionService = new CourseSessionService();
        List<CourseSession> listCourseSessions= courseSessionService.getCourseSessions(courseCode);
        return listCourseSessions;
    }
    
    /**
     * Récupération d'une liste de CourseSessions avec un Filtre
     *
     * @param courseTitle
     * @param courseDate
     * @param courseLocation
     * @return
     */
    public List<CourseSession> getCourseSessionFiltre(String courseTitle,Date courseDate,String courseLocation){
        CourseSessionService courseSessionService = new CourseSessionService();
        List<CourseSession> listCourseSessions= courseSessionService.getCourseSessionFiltre(courseTitle,courseDate,courseLocation);
        return listCourseSessions;
    }
    
    /**
     * Récupération d'une liste de tous les CourseSessions
     *
     * @return
     */
    public List<CourseSession> getAllCourseSessions(){
        CourseSessionService courseSessionService = new CourseSessionService();
        List<CourseSession> listCourseSessions= courseSessionService.getAllCourseSessions();
        return listCourseSessions;
    }
    
    /**
     * Récupération d'un CourseSession à partir du courseSessionId
     *
     * @param courseSessionId
     * @return
     */
    public CourseSession getCourseSession(int courseSessionId){
        CourseSessionService courseSessionService = new CourseSessionService();
        CourseSession courseSessionSelect= courseSessionService.getCourseSession(courseSessionId);
        return courseSessionSelect;
    }
    
}
