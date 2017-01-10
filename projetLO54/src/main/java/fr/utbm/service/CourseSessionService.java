package fr.utbm.service;

import fr.utbm.dao.CourseSessionDao;
import fr.utbm.javabeans.CourseSession;
import java.util.Date;
import java.util.List;

// Service de CourseSession
public class CourseSessionService {
    
    /**
     * Enregistrement d'un CourseSession
     *
     * @param newCourseSession
     */
    public void registerCourseSession(CourseSession newCourseSession)
    {
        CourseSessionDao courseSessionDao=new CourseSessionDao();
        courseSessionDao.save(newCourseSession);
    }
    
    /**
     * Récupération d'une liste de CourseSessions à partir de courseCode
     *
     * @param courseCode
     * @return
     */
    public List<CourseSession> getCourseSessions(String courseCode)
    {
        CourseSessionDao courseSessionDao=new CourseSessionDao();
        return courseSessionDao.getCourseSessions(courseCode);
    }
    
    /**
     * Récupération d'une liste de tous les CourseSessions
     *
     * @return
     */
    public List<CourseSession> getAllCourseSessions()
    {
        CourseSessionDao courseSessionDao=new CourseSessionDao();
        return courseSessionDao.getAllCourseSessions();
    }
    
    /**
     * Récupération d'un CourseSession à partir de son courseSessionId
     *
     * @param courseSessionId
     * @return
     */
    public CourseSession getCourseSession(int courseSessionId)
    {
        CourseSessionDao courseSessionDao=new CourseSessionDao();
        return courseSessionDao.getCourseSession(courseSessionId);
    }
    
    /**
     * Récupération d'une liste de CourseSessions avec filtre sur courseTitle, courseDate et courseLocation
     *
     * @param courseTitle
     * @param courseDate
     * @param courseLocation
     * @return
     */
    public List<CourseSession> getCourseSessionFiltre(String courseTitle, Date courseDate, String courseLocation )
    {
        CourseSessionDao courseSessionDao=new CourseSessionDao();
        return courseSessionDao.getCourseSessionFiltre(courseTitle,courseDate,courseLocation);
    }
}
