/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.modelUser;


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
    private int CategoryId;

    private CategoryDTO category;
    private AuthorDTO Author;

    public BookDTO(int BookId, String BookName, String Type, Year ReleaseDate, Blob PosterUrl, Blob BookUrl, Blob AvatarUrl, int CategoryId, CategoryDTO category, AuthorDTO Author) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.Type = Type;
        this.ReleaseDate = ReleaseDate;
        this.PosterUrl = PosterUrl;
        this.BookUrl = BookUrl;
        this.AvatarUrl = AvatarUrl;
        this.CategoryId = CategoryId;
        this.category = category;
        this.Author = Author;
    }

    public BookDTO(String BookName, String Type, Year ReleaseDate, Blob PosterUrl, Blob BookUrl, Blob AvatarUrl, int CategoryId, CategoryDTO category, AuthorDTO Author) {
        this.BookName = BookName;
        this.Type = Type;
        this.ReleaseDate = ReleaseDate;
        this.PosterUrl = PosterUrl;
        this.BookUrl = BookUrl;
        this.AvatarUrl = AvatarUrl;
        this.CategoryId = CategoryId;
        this.category = category;
        this.Author = Author;
    }
    
    
    public int getBookId() {
        return BookId;
    }

    public AuthorDTO getAuthor() {
        return Author;
    }
    
    public String getBookName() {
        return BookName;
    }

    public AuthorDTO getAuthorDTO() {
        return Author;
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

    public int getCategoryId() {
        return CategoryId;
    }

    public CategoryDTO getCategory() {
        return category;
    }
    
}
