/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_server.SQL.JPA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Do_Do
 */
@Entity
@Table(name = "feedback", catalog = "readbook", schema = "")
@NamedQueries({
    @NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f"),
    @NamedQuery(name = "Feedback.findByFeedBackId", query = "SELECT f FROM Feedback f WHERE f.feedBackId = :feedBackId"),
    @NamedQuery(name = "Feedback.findByUserId", query = "SELECT f FROM Feedback f WHERE f.userId = :userId"),
    @NamedQuery(name = "Feedback.findByFeedBackDate", query = "SELECT f FROM Feedback f WHERE f.feedBackDate = :feedBackDate"),
    @NamedQuery(name = "Feedback.findByContent", query = "SELECT f FROM Feedback f WHERE f.content = :content"),
    @NamedQuery(name = "Feedback.findByDescription", query = "SELECT f FROM Feedback f WHERE f.description = :description")})
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FeedBackId")
    private Integer feedBackId;
    @Basic(optional = false)
    @Column(name = "UserId")
    private int userId;
    @Basic(optional = false)
    @Column(name = "FeedBackDate")
    @Temporal(TemporalType.DATE)
    private Date feedBackDate;
    @Column(name = "Content")
    private String content;
    @Column(name = "Description")
    private String description;

    public Feedback() {
    }

    public Feedback(Integer feedBackId) {
        this.feedBackId = feedBackId;
    }

    public Feedback(Integer feedBackId, int userId, Date feedBackDate) {
        this.feedBackId = feedBackId;
        this.userId = userId;
        this.feedBackDate = feedBackDate;
    }

    public Integer getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(Integer feedBackId) {
        this.feedBackId = feedBackId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getFeedBackDate() {
        return feedBackDate;
    }

    public void setFeedBackDate(Date feedBackDate) {
        this.feedBackDate = feedBackDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedBackId != null ? feedBackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedback)) {
            return false;
        }
        Feedback other = (Feedback) object;
        if ((this.feedBackId == null && other.feedBackId != null) || (this.feedBackId != null && !this.feedBackId.equals(other.feedBackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Admin.ModelAdmin.SQL.Feedback[ feedBackId=" + feedBackId + " ]";
    }
    
}
