package ma.lms.lms.controllers;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.LibraryPatron;
import ma.lms.lms.repositories.LibraryPatronRepository;
import ma.lms.lms.services.LibraryPatronService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/patron")
public class LibraryPatronController {
    private final LibraryPatronService LibraryPatronService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getLibraryPatronById(@PathVariable long id){
        try{
            return ResponseEntity.ok(LibraryPatronService.getLibraryPatronById(id));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping("")
    public ResponseEntity<?> getAllLibraryPatron(){
        return ResponseEntity.ok(LibraryPatronService.getAllLibraryPatron());
    }


}
