package in.koost.pfi_tcscc_library.dto;

import in.koost.pfi_tcscc_library.models.Author;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorCreate {

    private String name;
    private String email;

    public void toAuthor(){
            Author.builder()
                .name(this.name)
                .email(this.email)
                .build();
    }


}
