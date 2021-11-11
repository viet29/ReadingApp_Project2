/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.modelUser;



import java.sql.Date;
import java.util.List;

/**
 *
 * @author Do_Do
 */
public class AuthorDTO {private int AuthorId;
    private int AuthorName;
    private Date BirthDate;
    private String Country;

    public AuthorDTO(int AuthorId, int AuthorName, Date BirthDate, String Country) {
        this.AuthorId = AuthorId;
        this.AuthorName = AuthorName;
        this.BirthDate = BirthDate;
        this.Country = Country;
    }

    public AuthorDTO() {
    }

    private List<BookDTO> listbook;

    public int getAuthorId() {
        return AuthorId;
    }

    public int getAuthorName() {
        return AuthorName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public String getCountry() {
        return Country;
    }

    public List<BookDTO> getListbook() {
        return listbook;
    }
    
}
