/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.main;

import fr.utbm.controller.DefaultCourseController;
import fr.utbm.javabeans.Course;
import java.util.List;

/**
 *
 * @author Souf
 */
public class AppGetCoursesFromClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultCourseController DCC = new DefaultCourseController();
        String emailClient = "soufian.besbiss@gmail.com";
        List<Course> clientCourses = DCC.getCoursesFromClient(emailClient);
        
        for(Course course : clientCourses){
            System.out.println(course.getTitle());
        }
    }
    
}
