package fr.utbm.servlet;

import fr.utbm.controller.DefaultClientController;
import fr.utbm.controller.DefaultCourseSessionController;
import fr.utbm.controller.DefaultMailController;
import fr.utbm.javabeans.CourseSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet d'inscription
 */
public class InscriptionServlet extends HttpServlet {
    
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
        try (PrintWriter out = response.getWriter()) {
            
            
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
        // Récupération des infos sur le client
        HttpSession session = request.getSession();
        String nom=(String) session.getAttribute("nom");
        String prenom=(String)session.getAttribute("prenom");
        String adresse=(String)session.getAttribute("adresse");
        String numTel=(String)session.getAttribute("numTel");
        String email=(String)session.getAttribute("email");
        int courseId=Integer.parseInt(request.getParameter("courseSessionId"));
        
        DefaultCourseSessionController defCourseSessionController=new DefaultCourseSessionController();
        CourseSession courseSession=defCourseSessionController.getCourseSession(courseId);
        DefaultClientController DCC = new DefaultClientController();
        DCC.registerClient(prenom,nom, adresse, numTel,email,courseSession);
        request.setAttribute("mode", "");
        // JavaMail : Envoi de mails vers l'administrateur et l'étudiant qui se préinscrit
        // Appel du contrôleur de mails
        DefaultMailController Dmail = new DefaultMailController();
        // Définition de l'objet et du message du mail à envoyer
        String subject = courseSession.getCourse().getTitle() + " : Préinscription de l'utilisateur " + email ;
        String message = "Bonjour,\n\n" + prenom + " " + nom
                + " a été préinscrit dans le cours \"" + courseSession.getCourse().getTitle()
                + "\" (Code : " + courseSession.getCourse().getCode()
                + ").\nDate de début : " + courseSession.getStartDate()
                + "\nDate de fin : " + courseSession.getEndDate()
                + "\nLieu : " + courseSession.getLocation().getCity()
                + "\n\nCordialement,\n\nl'équipe FORMACLUB.";
        // Envoi du mail à l'utilisateur préinscrit
        Dmail.sendMail(email, subject, message);
        // Envoi du mail à l'administrateur FORMACLUB
        String adresseAdmin = "soufian.besbiss@gmail.com";
        Dmail.sendMail(adresseAdmin, subject, message);
        // Requête/Réponse redirigées à la jsp correspondante
        RequestDispatcher redirect = request.getRequestDispatcher("/WEB-INF/jsp/validationInscription.jsp");
        redirect.forward(request,response);
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
        RequestDispatcher redirect = request.getRequestDispatcher("/listCourseSessions");
        redirect.forward(request,response);
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
