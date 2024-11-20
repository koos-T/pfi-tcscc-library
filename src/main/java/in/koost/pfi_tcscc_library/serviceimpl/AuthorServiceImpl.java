package in.koost.pfi_tcscc_library.serviceimpl;

import in.koost.pfi_tcscc_library.dto.AuthorCreate;
import in.koost.pfi_tcscc_library.models.Author;
import in.koost.pfi_tcscc_library.models.Book;
import in.koost.pfi_tcscc_library.repository.AuthorRepository;
import in.koost.pfi_tcscc_library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorCreate authorCreate;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);

    }

    @Override
     public Author makeAuthor(Book book){
        if(book.getAuthor() != null) {
            authorCreate.setName(book.getAuthor().getName());
            authorCreate.setEmail(book.getAuthor().getEmail());
            }
         return authorCreate.toAuthor();
    }
}
