/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.servlet;

import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.controller.DefaultLocationController;
import fr.utbm.javabeans.CourseSession;
import fr.utbm.javabeans.Location;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Souf
 */
public class ListCourseSessionsServlet extends HttpServlet {

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
            System.out.println("Je suis dans la ListCourseSessionsServlet");
            //Récupération des filtres
            String filtreFormation=request.getParameter("filtreFormation");
            String filtreDate=request.getParameter("filtreDate");
            String filtreLieu=request.getParameter("filtreLieu");
            //On créé des attributs afin de ne pas effacer les champs de filtres dans la page jsp
            
            //Vérification des filtres + conversion
            if(filtreFormation==null || filtreFormation.equals("") )
                filtreFormation="";
            if(filtreLieu==null || filtreLieu.equals("")  || filtreLieu.equals("---"))
            {
                filtreLieu="";
                request.setAttribute("lieuSelectionne", "---");
            }
            else
                request.setAttribute("lieuSelectionne", filtreLieu);
            
            Date sessionDate=null;
            if(filtreDate!=null && !filtreDate.equals(""))
            {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    sessionDate = sdf.parse(filtreDate);
                } catch (ParseException ex) {
                }
            }
            
            request.setAttribute("filtreFormation", filtreFormation);
            request.setAttribute("filtreDate", filtreDate);
            
            System.out.println("FiltreFormation: "+filtreFormation);
            System.out.println("FiltreDate: "+sessionDate);
            System.out.println("FiltreLieu: "+filtreLieu);
            // On fait appel au controleur de courseSession
            DefaultCourseSessionController DCSC = new DefaultCourseSessionController();
            //List<CourseSession> listeCourseSessions = DCSC.getAllCourseSessions();
            List<CourseSession> listeCourseSessions = DCSC.getCourseSessionFiltre(filtreFormation,sessionDate,filtreLieu);
            request.setAttribute("listeCourseSessions", listeCourseSessions);
            // On liste les lieux
            DefaultLocationController DLC = new DefaultLocationController();
            List<Location> listeLocations = DLC.getLocations();
            request.setAttribute("listeLocations", listeLocations);
            
            
            // Redirection vers le jsp
            RequestDispatcher formationsRedirect = request.getRequestDispatcher("/WEB-INF/jsp/listCourseSessions.jsp");
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