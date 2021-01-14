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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mukul
 */
public class addLocation extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       List<User> user = new ArrayList<>();
       
        try {
            user = UserDAOImpl.getAll();
        } catch (ClassNotFoundException| NullPointerException | SQLException ex) {
            Logger.getLogger(addLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
       String id, location;
       for(int i = 0; i<user.size(); i++)
       {
          id = user.get(i).getId();
          
          location = request.getParameter(id);
          if(!location.isEmpty())
          {
              try {
                  UserDAOImpl.update(location, id);
              } catch (ClassNotFoundException| NullPointerException | SQLException ex) {
                  Logger.getLogger(addLocation.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
          
       }
       
       request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
