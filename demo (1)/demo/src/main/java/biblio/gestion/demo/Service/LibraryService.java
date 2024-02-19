package biblio.gestion.demo.Service;

import biblio.gestion.demo.Repository.AuthorRepository;
import biblio.gestion.demo.Repository.BookRepository;
import biblio.gestion.demo.Repository.PatronRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PatronRepository patronRepository;

    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository, PatronRepository patronRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.patronRepository = patronRepository;
    }
}
