/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Model;


import java.sql.Date;
import java.util.List;

/**
 *
 * @author Do_Do
 */
public class ListFavoriteDTO {
    private int UserId;
    private List<BookDTO> listbook;

    public ListFavoriteDTO() {
    }

    public ListFavoriteDTO(int UserId, List<BookDTO> listbook) {
        this.UserId = UserId;
        this.listbook = listbook;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setListbook(List<BookDTO> listbook) {
        this.listbook = listbook;
    }
    
    
}
