package fr.utbm.service;

import java.util.List;

import fr.utbm.dao.CourseSessionDao;
import fr.utbm.javabeans.CourseSession;


public class CourseSessionService {
	public void registerCourse(CourseSession newCourse)
	{
		CourseSessionDao courseSessionDao=new CourseSessionDao();
		courseSessionDao.save(newCourse);
	}
	public List<CourseSession> getCourses()
	{
		CourseSessionDao courseSessionDao=new CourseSessionDao();
		return courseSessionDao.getCourseSessions();
	}
	public CourseSession getCourseSession(int courseSessionId)
	{
		CourseSessionDao courseSessionDao=new CourseSessionDao();
		return courseSessionDao.getCourseSession(courseSessionId);
	}
}
