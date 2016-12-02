package fr.utbm.service;

import java.util.List;

import fr.utbm.dao.CourseDao;
import fr.utbm.javabeans.Course;

public class CourseService {
	public void registerCourse(Course newCourse)
	{
		CourseDao courseDao=new CourseDao();
		courseDao.save(newCourse);
	}
	public List<Course> getCourses()
	{
		CourseDao courseDao=new CourseDao();
		return courseDao.getCourses();
	}
	public Course getCourse(int courseId)
	{
		CourseDao courseDao=new CourseDao();
		return courseDao.getCourse(courseId);
	}
}
