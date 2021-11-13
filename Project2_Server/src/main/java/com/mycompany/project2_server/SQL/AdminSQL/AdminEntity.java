/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_server.SQL.AdminSQL;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import org.eclipse.persistence.annotations.PrimaryKey;

/**
 *
 * @author Do_Do
 */
//@Entity(name = "Admin")
public class AdminEntity {
    //@PrimaryKey
    private int UserId;
    
    private String UserName;
    private String Name;
    private String PhoneNumber;
    private Date Birthdate;
    private String Gender;
    private String Address;
    private String AvatarUrl;
    private Timestamp CreatedOn;
    private String Description;
    private String RoleId;
    private String PassWord;

    public AdminEntity(int UserId, String UserName, String Name, String PhoneNumber, Date Birthdate, String Gender, String Address, String AvatarUrl, Timestamp CreatedOn, String Description, String RoleId, String PassWord) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Birthdate = Birthdate;
        this.Gender = Gender;
        this.Address = Address;
        this.AvatarUrl = AvatarUrl;
        this.CreatedOn = CreatedOn;
        this.Description = Description;
        this.RoleId = RoleId;
        this.PassWord = PassWord;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAvatarUrl(String AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    public void setCreatedOn(Timestamp CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public int getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
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

    public Timestamp getCreatedOn() {
        return CreatedOn;
    }

    public String getDescription() {
        return Description;
    }

    public String getRoleId() {
        return RoleId;
    }

    public String getPassWord() {
        return PassWord;
    }
    
}
