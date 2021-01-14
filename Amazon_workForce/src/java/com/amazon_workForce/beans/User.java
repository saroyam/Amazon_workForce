/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazon_workForce.beans;

/**
 *
 * @author mukul
 */
import java.io.Serializable;
public class User implements Serializable {
    private String name;
    private String id;
    private String level;
    private String location;
    
    public static final String COL_NAME = "Name";
    public static final String COL_ID = "ID";
    public static final String COL_LEVEL = "Level";
    public static final String COL_LOCATION = "Location";

    public User(String name, String id, String level, String location) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    public User() {
    }

    

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
    
}
