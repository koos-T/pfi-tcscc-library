package in.koost.pfi_tcscc_library.repository;

import in.koost.pfi_tcscc_library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
