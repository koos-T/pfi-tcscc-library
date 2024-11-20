package in.koost.pfi_tcscc_library.dto;

import in.koost.pfi_tcscc_library.models.Author;
import in.koost.pfi_tcscc_library.models.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AuthorCreate {



    private String name;
    private String email;

    public Author toAuthor(){
            return Author.builder()
                .name(this.name)
                .email(this.email)
                .build();
    }
   /* public void getAuthor(Book book){
        if(book.getAuthor() != null) {
            String name1 = book.getAuthor().getName();
            String email1 = book.getAuthor().getEmail();
            this.name = name1;
            this.email = email1;
            this.toAuthor();
            }

    }*/

}
