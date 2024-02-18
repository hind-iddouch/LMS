package ma.lms.lms.services;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.LibraryPatron;
import ma.lms.lms.repositories.LibraryPatronRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@AllArgsConstructor
@Service
public class LibraryPatronImp  implements LibraryPatronService{
    private final LibraryPatronRepository libraryPatronRepository;
    @Override
    public LibraryPatron getLibraryPatronById(long id) {
       return libraryPatronRepository
               .findById(id)
               .orElseThrow(() -> new NoSuchElementException("sorry we didnt find that patron!!!!"));
    }

    @Override
    public List<LibraryPatron> getAllLibraryPatron() {
        return libraryPatronRepository.findAll();
    }

}
