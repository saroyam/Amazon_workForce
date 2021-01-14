/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazon_workForce.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon_workForce.beans.User;
import com.amazon_workForce.daoimpl.UserDAOImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mukul
 */

//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Logout</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Logout at " + id + name + level + "</h1>");
//            out.println("</body>");
//            out.println("</html>");}


public class addAssociates extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        //HttpSession session = request.getSession();
        
        String name = request.getParameter("name");
        String id   = request.getParameter("id");
        String level= request.getParameter("level");
        
        User user = new User();
        
        user.setName(name);
        user.setId(id);
        user.setLevel(level);
        

        

        try {
            UserDAOImpl.addUser(user);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ClassNotFoundException | NullPointerException |SQLException ex) {
            Logger.getLogger(addAssociates.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

   
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    

}
