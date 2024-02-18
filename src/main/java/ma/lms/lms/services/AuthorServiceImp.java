package ma.lms.lms.services;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.Author;
import ma.lms.lms.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class AuthorServiceImp implements AuthorService{

    private final AuthorRepository authorRepository;
    @Override
    public Author getAuthorById(long id) {
        return  authorRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("sorry we didnt find that Author!!!!"));
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(long id){authorRepository.deleteById(id);
    }


}
