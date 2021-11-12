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
import javax.persistence.Lob;
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
@Table(name = "book", catalog = "readbook", schema = "")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByBookId", query = "SELECT b FROM Book b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "Book.findByBookName", query = "SELECT b FROM Book b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Book.findByAuthorId", query = "SELECT b FROM Book b WHERE b.authorId = :authorId"),
    @NamedQuery(name = "Book.findByType", query = "SELECT b FROM Book b WHERE b.type = :type"),
    @NamedQuery(name = "Book.findByReleaseDate", query = "SELECT b FROM Book b WHERE b.releaseDate = :releaseDate"),
    @NamedQuery(name = "Book.findByCountry", query = "SELECT b FROM Book b WHERE b.country = :country"),
    @NamedQuery(name = "Book.findByDescription", query = "SELECT b FROM Book b WHERE b.description = :description"),
    @NamedQuery(name = "Book.findByCategoryId", query = "SELECT b FROM Book b WHERE b.categoryId = :categoryId")})
public class Book implements Serializable {

    @Basic(optional = false)
    @Lob
    @Column(name = "PosterUrl")
    private byte[] posterUrl;
    @Basic(optional = false)
    @Lob
    @Column(name = "BookUrl")
    private byte[] bookUrl;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BookId")
    private Integer bookId;
    @Basic(optional = false)
    @Column(name = "BookName")
    private String bookName;
    @Column(name = "AuthorId")
    private Integer authorId;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "ReleaseDate")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Basic(optional = false)
    @Column(name = "Country")
    private String country;
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "CategoryId")
    private int categoryId;

    public Book() {
    }

    public Book(Integer bookId) {
        this.bookId = bookId;
    }

    public Book(Integer bookId, String bookName, String type, Date releaseDate, String country, byte[] posterUrl, byte[] bookUrl, int categoryId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.type = type;
        this.releaseDate = releaseDate;
        this.country = country;
        this.posterUrl = posterUrl;
        this.bookUrl = bookUrl;
        this.categoryId = categoryId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Admin.ModelAdmin.SQL.Book[ bookId=" + bookId + " ]";
    }

    public byte[] getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(byte[] posterUrl) {
        this.posterUrl = posterUrl;
    }

    public byte[] getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(byte[] bookUrl) {
        this.bookUrl = bookUrl;
    }
    
}
