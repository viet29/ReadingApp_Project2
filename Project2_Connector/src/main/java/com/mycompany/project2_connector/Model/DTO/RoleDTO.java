/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class RoleDTO {
    private int Id;
    private String name;
    private String Description;
    
    private ArrayList<UserDTO> UserList;

    public String getDescription() {
        return Description;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<UserDTO> getUserList() {
        return UserList;
    }
    
    
}
