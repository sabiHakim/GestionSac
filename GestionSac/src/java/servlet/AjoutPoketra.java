/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import connect.ConnectPostgres;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.DetailPoketra;
import model.Look;
import model.MatierePremiere;
import model.MatieresPremiereLook;
import model.Poketra;

/**
 *
 * @author Tafita
 */
public class AjoutPoketra extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AjoutPoketra</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AjoutPoketra at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        int idType = Integer.parseInt(request.getParameter("idType"));
        int idLook = Integer.parseInt(request.getParameter("idLook"));
        int idTaille = Integer.parseInt(request.getParameter("idTaille"));
        String[] idMp=request.getParameterValues("mp");
        String[] quantite=request.getParameterValues("qte");

        
        int[] idm = new int[idMp.length];
        int[] qte = new int[quantite.length];
         for(int i=0;i<idMp.length;i++) {
            idm[i] = Integer.parseInt(idMp[i]);
            qte[i] = Integer.parseInt(quantite[i]);
        }
        try {
//            ArrayList<MatierePremiere> list = new Look().getMatierePremiereByIdLook(idLook);
            Poketra p = new Poketra();
            p.insertPoketra(idType, idLook, idTaille);
            DetailPoketra dt = new DetailPoketra();
             for(int i=0;i<idm.length;i++){
                 dt.insertDetail(ConnectPostgres.getLastId(), idm[i],qte[i]);
             }
//            p.insertPoketra(idType, idLook, idTaille);
//            for(MatierePremiere matiere : list){
//                int idP = ConnectPostgres.getLastId();
//                int quantite = Integer.parseInt(request.getParameter(""+matiere.getId()));
//                dt.insertDetail(idP, matiere.getId(), quantite);
//            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect(request.getHeader("referer"));
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
