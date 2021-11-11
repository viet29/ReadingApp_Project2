/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.modelUser;



import java.util.List;
/**
 *
 * @author Do_Do
 */
public class CategoryDTO {
    private int CategoryId;
    private String CategoryName;
    private List<BookDTO> listbook;

    public CategoryDTO() {
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public void setListbook(List<BookDTO> listbook) {
        this.listbook = listbook;
    }

    public CategoryDTO(int CategoryId, String CategoryName, List<BookDTO> listbook) {
        this.CategoryId = CategoryId;
        this.CategoryName = CategoryName;
        this.listbook = listbook;
    }
    
}
