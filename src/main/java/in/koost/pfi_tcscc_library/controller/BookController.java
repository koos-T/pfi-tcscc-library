package in.koost.pfi_tcscc_library.controller;


import in.koost.pfi_tcscc_library.dto.BookCreate;
import in.koost.pfi_tcscc_library.models.Book;
import in.koost.pfi_tcscc_library.serviceimpl.BookServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @PostMapping("/saveBook")
    public ResponseEntity<String> saveBook(@Valid @RequestBody BookCreate bookCreate){
        Book book = bookCreate.toBook();
        bookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
