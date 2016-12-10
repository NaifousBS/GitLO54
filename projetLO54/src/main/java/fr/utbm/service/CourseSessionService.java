package fr.utbm.service;

import java.util.List;

import fr.utbm.dao.CourseSessionDao;
import fr.utbm.javabeans.CourseSession;
import java.util.Date;


public class CourseSessionService {
	public void registerCourseSession(CourseSession newCourseSession)
	{
            CourseSessionDao courseSessionDao=new CourseSessionDao();
            courseSessionDao.save(newCourseSession);
	}
	public List<CourseSession> getCourseSessions(String courseCode)
	{
            CourseSessionDao courseSessionDao=new CourseSessionDao();
            return courseSessionDao.getCourseSessions(courseCode);
	}
        public List<CourseSession> getAllCourseSessions()
	{
            CourseSessionDao courseSessionDao=new CourseSessionDao();
            return courseSessionDao.getAllCourseSessions();
	}
	public CourseSession getCourseSession(int courseSessionId)
	{
            CourseSessionDao courseSessionDao=new CourseSessionDao();
            return courseSessionDao.getCourseSession(courseSessionId);
	}
        
        public List<CourseSession> getCourseSessionFiltre(String courseTitle, Date courseDate, String courseLocation )
	{
            CourseSessionDao courseSessionDao=new CourseSessionDao();
            return courseSessionDao.getCourseSessionFiltre(courseTitle,courseDate,courseLocation);
	}
}
