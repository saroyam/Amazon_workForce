<%-- 
    Document   : wheretogo
    Created on : 28-Dec-2020, 11:39:45 AM
    Author     : mukul
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>WhereToGo</title>
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
              <li style="padding:15px">Where to go</li>
            </ul>
            


      </header>

      <div id="wrapper">
      <div class="hero-image" id="home">
            <div class = "hero-text">
              <h1 style="font-size:50px">Where To Go:</h1>
              <form method="get" action="wheretogo" >
              <h3>Please Enter your Login:</h3>
              <input class="button button1" name="id" placeholder="Enter your login">
              <button class="button button1" type ="submit">Enter</button> 
              </form>
            </div>
      </div>

      </div>


  </body>
  </html>
