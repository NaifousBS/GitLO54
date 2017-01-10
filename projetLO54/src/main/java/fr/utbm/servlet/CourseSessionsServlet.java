/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.servlet;

import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.javabeans.CourseSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Servlet qui va traiter les informations liées aux sessions de cours
 */
public class CourseSessionsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // On instancie le contrôleur de CourseSession
            DefaultCourseSessionController DCSC = new DefaultCourseSessionController();
            // On récupère la liste avec le paramètre "courseCode" puis on l'attribue à une liste listeCourseSessions
            List<CourseSession> listeCourseSessions = DCSC.getCourseSessions(request.getParameter("courseCode"));
            // On attribue la variable "listeCourseSessions" à la liste listeCourseSessions pour qu'elle soit utilisable dans la jsp
            request.setAttribute("listeCourseSessions", listeCourseSessions);
            // On redirige la requête et la réponse à la jsp correspondante
            RequestDispatcher formationsRedirect = request.getRequestDispatcher("/WEB-INF/jsp/courseSessions.jsp");
            formationsRedirect.forward(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
