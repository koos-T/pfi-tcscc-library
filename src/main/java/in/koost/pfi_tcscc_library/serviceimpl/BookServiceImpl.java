package in.koost.pfi_tcscc_library.serviceimpl;

import in.koost.pfi_tcscc_library.models.Book;
import in.koost.pfi_tcscc_library.repository.BookRepository;
import in.koost.pfi_tcscc_library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}
