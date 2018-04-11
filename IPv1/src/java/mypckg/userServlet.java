package mypckg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mypckg.EncryptPw;
import mypckg.User;


/**
 *
 * @author Chath
 */
@WebServlet(urlPatterns = {"/userServlet"})
public class userServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
        String status;
        String username;
        String password;
        
        username = request.getParameter("username");
        password = request.getParameter("password");
        
        //Encrtpt password
        EncryptPw encrypt = new EncryptPw();
        encrypt.setPw(password);
        try {
            password=encrypt.enc();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        //add encrypted pw and username to db
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        try {
             status = u.addUser();
             if(Integer.parseInt(status)>0){
  
                //start session
                 HttpSession s = request.getSession(true);
                 s.setAttribute("username", username);
                 response.sendRedirect("homepage.jsp");
             }
             else if(Integer.parseInt(status)==-153)
             {
              request.setAttribute("status", "An account for this email already exists!Use a different email!" );
              RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
             }
                 
             else{
             request.setAttribute("status", status);
             //show status
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);}
        }        
        catch (SQLException ex) {
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
//            PrintWriter out = response.getWriter();
//            out.println(status); 
//            PrintWriter out = response.getWriter();
//            out.println(status); 
//            PrintWriter out = response.getWriter();
//            out.println(status); 
//            PrintWriter out = response.getWriter();
//            out.println(status);
            
            
    }
}
