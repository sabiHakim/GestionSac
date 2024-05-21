/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Fabrication;

/**
 *
 * @author Hakim
 */
public class insertFab extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertFab</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet insertFab at " + request.getContextPath() + "</h1>");
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
//processRequest(request, response);
PrintWriter out = response.getWriter();
          int idType = Integer.parseInt(request.getParameter("idType"));
          int idTaille = Integer.parseInt(request.getParameter("idTaille"));

          String[] idEmp=request.getParameterValues("mp");
          String[] nb=request.getParameterValues("nb");
          String[] nbheure=request.getParameterValues("heurre");
//        out.println(nbheure);
          int[] idEmployer = new int[idEmp.length];
          int[] nombre = new int[nb.length];
          int[] nombreH = new int[nbheure.length];
          for(int i =  0;i<idEmp.length;i++){
              idEmployer[i] = Integer.parseInt(idEmp[i]);
              nombre[i] = Integer.parseInt(nb[i]);
              nombreH[i] = Integer.parseInt(nbheure[i]);
          }
             
            

          try{
              Fabrication f = new Fabrication();
              for(int j = 0 ;j< idEmployer.length;j++){
                  f.insertFab(idType, idTaille, idEmployer[j],nombre[j] ,nombreH[j]);
              }
//              f.compteFab(idType);
            response.sendRedirect(request.getHeader("referer"));

          }
          catch(Exception e){
//              PrintWriter out = response.getWriter();
              out.println(e.getMessage());
          
          }



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
