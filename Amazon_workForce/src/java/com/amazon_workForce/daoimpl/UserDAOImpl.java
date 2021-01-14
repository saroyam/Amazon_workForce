/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazon_workForce.daoimpl;

import com.amazon_workForce.beans.User;
import com.amazon_workForce.dao.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mukul
 */

public class UserDAOImpl implements DAOInterface<User>{
     
    private static final String INSERT_USERS = "INSERT INTO associates (Name, ID, Level) VALUES(?,?,?)";
    private static final String UPDATE_LOCATION = "UPDATE associates\n" +
                                                    "SET Location = ?\n" +
                                                    "WHERE ID = ?";
    private static final String GET_BY_USER_ID = "SELECT * FROM associates WHERE ID = ?";
    private static final String GET_ALL = "SELECT * FROM associates order by Name ASC";
    
    
    public static boolean addUser(User member) throws ClassNotFoundException, SQLException{
        
        
        try (Connection con = new DataSource().createConnection();
                PreparedStatement pstmt = con.prepareStatement(INSERT_USERS);) {

            
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getId());
            pstmt.setString(3, member.getLevel());
             pstmt.executeUpdate();
            return true;
        }
        catch(Exception e)
        {
            //System.out.println(e.getMessage());//used for testing errors.
            return false;
        }
            
            
    }
    
//    public static User isUserAuthenticated(User t) throws ClassNotFoundException, SQLException {
//        User user = null;
//        try (Connection con = new DataSource().createConnection();
//                PreparedStatement pstmt = con.prepareStatement(VALIDATE_USER);) {
//
//            pstmt.setString(1, t.getEmail());
//            pstmt.setString(2, t.getPass());
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                user = new User();
//                
//                user.setName(rs.getString(User.COL_NAME));
//                user.setEmail(rs.getString(User.COL_EMAIL));
//                user.setPass(rs.getString(User.COL_PASS));
//            }
//        } catch (SQLException ex) {
//            System.out.println("isUserAuthenticated: " + ex.getMessage());
//            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return user;
//    }
    
    public static User getById(String id) throws ClassNotFoundException, SQLException {
        User user = null;
        
        try (
            Connection con = new DataSource().createConnection();
            PreparedStatement pstmt = con.prepareStatement(GET_BY_USER_ID);){
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new User();
                
                user.setName(rs.getString(User.COL_NAME));
                user.setId(rs.getString(User.COL_ID));
                user.setLevel(rs.getString(User.COL_LEVEL));
                user.setLocation(rs.getString(User.COL_LOCATION));
            }
        } catch (SQLException ex) {
            System.out.println("getByID: " + ex.getMessage());
          
        }

        return user;
    }
    
    public static List<User> getAll() throws ClassNotFoundException, SQLException {
        List<User> user = new ArrayList<>();
        User userBean;
        try (
            Connection con = new DataSource().createConnection();
            PreparedStatement pstmt = con.prepareStatement(GET_ALL);){
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                userBean = new User();
                
                userBean.setName(rs.getString(User.COL_NAME));
                userBean.setId(rs.getString(User.COL_ID));
                userBean.setLevel(rs.getString(User.COL_LEVEL));
                userBean.setLocation(rs.getString(User.COL_LOCATION));
                
                user.add(userBean);
            }
        } catch (SQLException ex) {
            System.out.println("getALL: " + ex.getMessage());
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

   
    


  
    public static boolean update(String location, String id)throws ClassNotFoundException, SQLException 
    {
        
        try(
                Connection con = new DataSource().createConnection();
            PreparedStatement pstmt = con.prepareStatement(UPDATE_LOCATION);){


            
            pstmt.setString(1, location);
            pstmt.setString(2,id);
            
             pstmt.executeUpdate();
            return true;}
        catch(Exception e)
        {
            return false;
        }
    }

  
    
}