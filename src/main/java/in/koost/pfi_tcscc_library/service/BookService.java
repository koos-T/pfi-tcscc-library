package in.koost.pfi_tcscc_library.service;

import in.koost.pfi_tcscc_library.dto.BookCreate;
import in.koost.pfi_tcscc_library.models.Book;

public interface BookService {

    public String saveBook(Book book);
}
