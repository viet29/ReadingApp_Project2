/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;

import com.mycompany.project2_connector.Admin.Model.AdminDTO.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CategoryDTO {
    private int Id;
    private String Name, Description;
    
    private ArrayList<BookDTO> listOfBooks;

    public CategoryDTO() {
    }

    public CategoryDTO(int Id, String Name, String Description, ArrayList<BookDTO> listOfBooks) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.listOfBooks = listOfBooks;
    }
    
    public CategoryDTO(int Id, String Name, String Description) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
    }
    
    public String getDescription() {
        return Description;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public ArrayList<BookDTO> getListOfBooks() {
        return listOfBooks;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setListOfBooks(ArrayList<BookDTO> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
