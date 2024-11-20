package in.koost.pfi_tcscc_library.serviceimpl;

import in.koost.pfi_tcscc_library.dto.BookCreate;
import in.koost.pfi_tcscc_library.models.Author;
import in.koost.pfi_tcscc_library.models.Book;
import in.koost.pfi_tcscc_library.repository.AuthorRepository;
import in.koost.pfi_tcscc_library.repository.BookRepository;
import in.koost.pfi_tcscc_library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorServiceImpl authorService;

      @Override
    public Book saveBook(BookCreate bookCreate) {
          Book book = bookCreate.toBook();
          Author author = authorService.saveAuthor(book.getAuthor());
          book.setAuthor(author);
         return bookRepository.save(book);
      }

    /*@Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }*/


}
