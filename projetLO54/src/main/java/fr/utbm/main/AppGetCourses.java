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
 * @author Ahmet
 */
public class AppGetCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultCourseController defCourseController=new DefaultCourseController();
        List<Course> listCourses= defCourseController.getCourses();
        for(int i=0; i<listCourses.size();i++)
            System.out.println(listCourses.get(i).getTitle());
    }
    
}
