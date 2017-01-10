package fr.utbm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet de connexion
 */
public class ConnexionServlet extends HttpServlet {
    
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
            String nom=request.getParameter("inputNom");
            String prenom=request.getParameter("inputPrenom");
            String adresse=request.getParameter("inputAdresse");
            String numTel=request.getParameter("inputNumTel");
            String email=request.getParameter("inputEmail");
            //Si tous les champs sont remplis
            if(nom!= null && !nom.isEmpty()
                    && prenom!=null  && !nom.isEmpty()
                    && adresse!= null  && !nom.isEmpty()
                    && numTel!=null  && !nom.isEmpty()
                    && email!=null)
            {
                /* Création ou récupération de la session */
                HttpSession session = request.getSession();
                
                /* Mise en session */
                session.setAttribute("nom", nom);
                session.setAttribute("prenom", prenom);
                session.setAttribute("adresse", adresse);
                session.setAttribute("numTel", numTel);
                session.setAttribute("email", email);
                RequestDispatcher redirect = request.getRequestDispatcher("/home");
                redirect.forward(request,response);
            }
            else
            {
                RequestDispatcher homeRedirect = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
                homeRedirect.forward(request,response);
            }
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
