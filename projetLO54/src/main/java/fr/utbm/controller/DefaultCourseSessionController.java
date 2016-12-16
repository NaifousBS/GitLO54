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
	public List<CourseSession> getCourseSessions(String courseCode){
            CourseSessionService courseSessionService = new CourseSessionService();
            List<CourseSession> listCourseSessions= courseSessionService.getCourseSessions(courseCode);
            return listCourseSessions;
	}
        public List<CourseSession> getCourseSessionFiltre(String courseTitle,Date courseDate,String courseLocation){
            CourseSessionService courseSessionService = new CourseSessionService();
            List<CourseSession> listCourseSessions= courseSessionService.getCourseSessionFiltre(courseTitle,courseDate,courseLocation);
            return listCourseSessions;
	}
        public List<CourseSession> getAllCourseSessions(){
            CourseSessionService courseSessionService = new CourseSessionService();
            List<CourseSession> listCourseSessions= courseSessionService.getAllCourseSessions();
            return listCourseSessions;
	}
	public CourseSession getCourseSession(int courseSessionId){
            CourseSessionService courseSessionService = new CourseSessionService();
            CourseSession courseSessionSelect= courseSessionService.getCourseSession(courseSessionId);
            return courseSessionSelect;
	}

}
