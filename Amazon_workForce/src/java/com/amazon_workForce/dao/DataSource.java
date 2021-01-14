/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazon_workForce.dao;

/**
 *
 * @author mukul
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dEvil
 */
public class DataSource {

    private static final String HOSTNAME = "jdbc:mysql://localhost/amazon_workForce";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sheridan";

    public DataSource() {

    }

    public Connection createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection: " + e.getMessage());
        }
        return null;
    }

}