package in.koost.pfi_tcscc_library.repository;

import in.koost.pfi_tcscc_library.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
