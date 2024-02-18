package ma.lms.lms.controllers;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.Author;
import ma.lms.lms.services.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable long id){
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }
    @GetMapping("")
    public ResponseEntity<?> getAllAuthor(){
        return ResponseEntity.ok(authorService.getAllAuthor());
    }
    @PostMapping("")
    public ResponseEntity<?> addAuthor(@RequestBody Author author){
        return ResponseEntity.ok(authorService.addAuthor(author));
    }
    @PutMapping("")
    public ResponseEntity<?> updateAuthor(@RequestBody Author author){
        return ResponseEntity.ok(authorService.updateAuthor(author));
    }
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable long id){authorService.deleteAuthor(id);}

}
