/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypckg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chath
 */
@WebServlet(name = "orderprocess", urlPatterns = {"/orderprocess"})
public class orderprocess extends HttpServlet {

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
            out.println("<title>Servlet orderprocess</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='http://localhost:8080/IPv1/homepage.jsp' >Back to homepage</a>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
       double total =0,itemprice,itemq;     int i=0;
        Enumeration paramNames1 = request.getParameterNames();
        int b = Integer.parseInt(request.getParameter("b"));
        
        System.out.println(b+"as");
               while(i<b) {
                  itemprice =0; itemq=0;
                  
                  itemprice = Double.parseDouble(request.getParameter("item"+i+"price"));
                  itemq = Double.parseDouble(request.getParameter("item"+i+"quantity"));
                  PrintWriter out = response.getWriter();
                  total= total+ (itemprice*itemq);
                  out.print("<p>" + itemprice + "</p>");
                  //String paramValue = request.getParameter(paramName);
                  out.println("<p>" + itemq + "</p>");
                  out.print("<p>" + total + "</p>");
                  i++;
                 
               }
        
            request.setAttribute("total", total);
            RequestDispatcher rdconf = request.getRequestDispatcher("orderconfirm.jsp");
            rdconf.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

}
