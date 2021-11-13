/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.DTO;



import com.mycompany.project2_connector.Admin.Model.AdminDTO.*;
import java.sql.Blob;
import java.time.Year;

/**
 *
 * @author Do_Do
 */
public class BookDTO {
    private int BookId;
    private String BookName;
    private String Type;
    private Year ReleaseDate;
    private Blob PosterUrl;
    private Blob BookUrl;
    private Blob AvatarUrl;
    private CategoryDTO Category;
    private AuthorDTO Author;

    public BookDTO(int BookId, String BookName, String Type, Year ReleaseDate, Blob PosterUrl, Blob BookUrl, Blob AvatarUrl, CategoryDTO Category, AuthorDTO Author) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.Type = Type;
        this.ReleaseDate = ReleaseDate;
        this.PosterUrl = PosterUrl;
        this.BookUrl = BookUrl;
        this.AvatarUrl = AvatarUrl;
        this.Category = Category;
        this.Author = Author;
    }

    
    public BookDTO() {
    }
    
    public int getBookId() {
        return BookId;
    }
    public String getBookName() {
        return BookName;
    }

    public String getType() {
        return Type;
    }

    public Year getReleaseDate() {
        return ReleaseDate;
    }

    public Blob getPosterUrl() {
        return PosterUrl;
    }

    public Blob getBookUrl() {
        return BookUrl;
    }

    public Blob getAvatarUrl() {
        return AvatarUrl;
    }

    public CategoryDTO getCategory() {
        return Category;
    }

    public AuthorDTO getAuthor() {
        return Author;
    }

    public void setBookId(int BookId) {
        this.BookId = BookId;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setReleaseDate(Year ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public void setPosterUrl(Blob PosterUrl) {
        this.PosterUrl = PosterUrl;
    }

    public void setBookUrl(Blob BookUrl) {
        this.BookUrl = BookUrl;
    }

    public void setAvatarUrl(Blob AvatarUrl) {
        this.AvatarUrl = AvatarUrl;
    }

    public void setAuthor(AuthorDTO Author) {
        this.Author = Author;
    }

    public void setCategory(CategoryDTO Category) {
        this.Category = Category;
    }
}
