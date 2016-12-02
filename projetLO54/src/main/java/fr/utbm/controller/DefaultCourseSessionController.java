package fr.utbm.controller;

import java.util.List;

import fr.utbm.javabeans.*;
import fr.utbm.service.CourseSessionService;
import java.util.Date;

public class DefaultCourseSessionController {
	public void registerCourseSession(Date startDate, Date endDate,Course course, Location location){
            // Instanciation de location
            CourseSession courseSessionToRegister = new CourseSession();
            courseSessionToRegister.setStartDate(startDate);
            courseSessionToRegister.setEndDate(endDate);
            courseSessionToRegister.setCourse(course);
            courseSessionToRegister.setLocation(location);
            // Ajout en base
            CourseSessionService courseSessionService = new CourseSessionService();
            courseSessionService.registerCourseSession(courseSessionToRegister);
	}
	public List<CourseSession> getCourseSessions(){
            CourseSessionService courseSessionService = new CourseSessionService();
            List<CourseSession> listCourseSessions= courseSessionService.getCourseSessions();
            return listCourseSessions;
	}
	public CourseSession getCourseSession(int courseSessionId){
            CourseSessionService courseSessionService = new CourseSessionService();
            CourseSession courseSessionSelect= courseSessionService.getCourseSession(1);
            return courseSessionSelect;
	}

}
