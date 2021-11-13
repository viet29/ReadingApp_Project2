/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;

import java.util.Date;


public class AuthorDTO {
    private int id;
    private String Name;
    private Date Birthdate;
    private String Country;
    private String Description;

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }
    
    public Date getbirthdate() {
        return Birthdate;
    }

    public String getCountry() {
        return Country;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
