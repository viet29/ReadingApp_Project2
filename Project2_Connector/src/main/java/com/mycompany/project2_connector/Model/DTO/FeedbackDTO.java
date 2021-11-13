/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;


import com.mycompany.project2_connector.Admin.Model.AdminDTO.*;
import java.sql.Date;

/**
 *
 * @author Do_Do
 */
public class FeedbackDTO {
    private int FeedBackId;
    private UserDTO user;
    private Date FeedBackDate;
    private String Content;

    public FeedbackDTO() {
    }

    public FeedbackDTO(int FeedBackId, UserDTO user, Date FeedBackDate, String Content) {
        this.FeedBackId = FeedBackId;
        this.user = user;
        this.FeedBackDate = FeedBackDate;
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }

    public Date getFeedBackDate() {
        return FeedBackDate;
    }

    public int getFeedBackId() {
        return FeedBackId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public void setFeedBackDate(Date FeedBackDate) {
        this.FeedBackDate = FeedBackDate;
    }

    public void setFeedBackId(int FeedBackId) {
        this.FeedBackId = FeedBackId;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

   
    
}
