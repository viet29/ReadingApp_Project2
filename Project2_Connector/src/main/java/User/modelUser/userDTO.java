/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.modelUser;


import java.sql.Date;

/**
 *
 * @author Do_Do
 */
public class userDTO {
    private int UserId;
    private String UserName;
    private String Name;
    private String PhoneNumber;
    private Date Birthdate;
    private String Gender;
    private String Address;
    private String AvatarUrl;

    public userDTO() {
    }

    public userDTO(int UserId, String UserName, String Name, String PhoneNumber, Date Birthdate, String Gender, String Address, String AvatarUrl) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Birthdate = Birthdate;
        this.Gender = Gender;
        this.Address = Address;
        this.AvatarUrl = AvatarUrl;
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
    
}
