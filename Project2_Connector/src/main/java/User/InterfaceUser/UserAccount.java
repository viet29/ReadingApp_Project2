/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.InterfaceUser;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Do_Do
 */
public class UserAccount implements Serializable {
    private int UserId;
    private String UserName;
    private String Name;
    private String Gender;
    private String Address;
    private Date Birthdate;
    private int RoleId;
    private byte[] AvatarUrl;

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public void setAvatarUrl(byte[] AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
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

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public int getRoleId() {
        return RoleId;
    }

    public byte[] getAvatarUrl() {
        return AvatarUrl;
    }
}