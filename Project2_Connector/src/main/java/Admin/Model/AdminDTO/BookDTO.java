/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Model.AdminDTO;



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
    private int AuthorId;
    
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

    public int getCategoryId() {
        return CategoryId;
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

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public void setAuthorId(int AuthorId) {
        this.AuthorId = AuthorId;
    }
}
