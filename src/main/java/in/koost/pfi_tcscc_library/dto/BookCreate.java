package in.koost.pfi_tcscc_library.dto;

import in.koost.pfi_tcscc_library.enums.Genre;
import in.koost.pfi_tcscc_library.models.Author;
import in.koost.pfi_tcscc_library.models.Book;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookCreate {

    @NotBlank
    private java.lang.String name;

    @Positive
    private double price;

    @NotNull
    private Genre genre;

    @NotNull
    private Author author;

    public Book toBook(){
        return Book.builder()
                .price(this.price)
                .name(this.name)
                .genre(this.genre)
                .author(this.author)
                .build();
    }
}
