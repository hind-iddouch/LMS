package ma.lms.lms.services;

import ma.lms.lms.entities.Author;

import java.util.List;

public interface AuthorService {

    public Author getAuthorById(long id);
    public List<Author> getAllAuthor();
    public Author addAuthor(Author author);
    public Author updateAuthor(Author author);
    public void deleteAuthor(long id);



}
