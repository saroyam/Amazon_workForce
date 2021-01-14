<%-- 
    Document   : index
    Created on : 25-Dec-2020, 8:32:08 AM
    Author     : mukul
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.amazon_workForce.beans.User"%>
<%@ page import="com.amazon_workForce.daoimpl.UserDAOImpl"%>



<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Workforce Assign</title>
    <link rel="stylesheet" href="css/main.css">
    <link rel="shortcut icon" href="images/logo.png" type="image/png">
    <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile.structure-1.4.5.min.css" />
    <script src="js/main.js"></script>

  </head>

  <body>


    <header>
            <ul>
              <li style="margin-left:40px" id="pacman"></li>
              <li style="padding:15px">Workforce Assign</li>
            </ul>
            <ul>
              <li><button class="list" onclick="location.href='#home'">Home</button></li>
              <li><button class="list" onclick="location.href='#assign'">Assign Associates</button></li>

            </ul>


      </header>

      <div id="wrapper">
      <div class="hero-image" id="home">
            <div class = "hero-text">
              <h1 style="font-size:50px">Amazon WorkForce Assign.</h1>
              <h3>Please Add/Assign associates:</h3>
              <button class="button button1" onclick="location.href='#assign'">Add/Assign Associates</button>
            </div>
      </div>

      

      <div class="hero-image" id="assign">
            <div class = "hero-text">
              <h1 style="font-size:50px">Assign Associates</h1>
                            
              
                <table border="1">
                    
                    <% List<User> user = new ArrayList<>(); 
                        user = UserDAOImpl.getAll();
                    %>
                        
                    <form method="post" action="addLocation" >
                    <tr style="font-weight: bold; text-align: center;">
                        <td>Name</td>
                        <td>ID</td>
                        <td>Level</td>
                        <td>Location</td>
                        <td>Enter location</td>
                        
                    </tr>
                    <%  String name, id, level, location;
                        
                        for(int i = 0; i < user.size(); i++) { 
                        name    = user.get(i).getName();
                        id      = user.get(i).getId();
                        level   = user.get(i).getLevel();
                        location= user.get(i).getLocation();
                    %>
                        <tr>      
                            <td><%=name%></td>
                            <td><%=id%></td>
                            <td><%=level%></td>
                            <td><%=location%></td>
                            <td><input class="button button1" name="<%=id%>" type="text"></td>  
                        </tr>
                    <% } %>
                </table> 
                
                <button type="submit" class="button button1">Add Location</button>
                
                </form>
                
                <button onclick="openForm()" class="button button1">Add Associates</button>
               <div class="form-popup" id="myForm"> 
                    <form method="post" action="addAssociates" class="form-container">
                      <h1>Login</h1>

                      <label for="name"><b>Name</b></label><br> 
                      <input class="button button1" type="text" placeholder="Enter Name" name="name" required><br>

                      <label for="id"><b>ID</b></label><br>
                      <input class="button button1" type="text" placeholder="Enter ID" name="id" required><br>
                      
                      <label for="level"><b>Level</b></label><br>
                      <select class="button button1" name="level" required>
                        <option value="1">Level 1</option>
                        <option value="2">Level 2</option>
                        <option value="3">Level 3</option>
                        
                      </select><br> 

                      <button type="submit" class="btn">Add Associate</button>
                      <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
                    </form>
                </div>
                
                <button class="button button1" onclick="location.href='#home'">Home</button>
              

              
            </div>
      </div>


    </div>


  </body>
  </html>