/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;

import java.util.ArrayList;
import java.util.Date;

class UserDTO {
    private int Id;
    private String Username;
    private String Password;
    private String Name;
    private String PhoneNumber;
    private Date Birthdate;
    private String Gender;
    private String Address;
    private String AvatarUrl;
    private RoleDTO role;

    private ArrayList<FeedbackDTO> FeedbackList;
    
    public UserDTO() {
    }

    public UserDTO(int Id, String Username, String Password, String Name, String PhoneNumber, Date Birthdate, String Gender, String Address, String AvatarUrl, RoleDTO role) {
        this.Id = Id;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Birthdate = Birthdate;
        this.Gender = Gender;
        this.Address = Address;
        this.AvatarUrl = AvatarUrl;
        this.role = role;
    }

    public ArrayList<FeedbackDTO> getFeedbackList() {
        return FeedbackList;
    }

    public void setFeedbackList(ArrayList<FeedbackDTO> FeedbackList) {
        this.FeedbackList = FeedbackList;
    }
    
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public String getAvatarUrl() {
        return AvatarUrl;
    }

    public RoleDTO getRole() {
        return role;
    }
    
    
}
