import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.model.repostory.BookRepository;

@RestController
public class BookController {
@Autowired
private BookRepository repository;

@PostMapping("/addBook")
public String saveBook(@RequestBody Book book)
{
repository.save(book);
return "Added book with id:" + ((Object) book).getId();
}
@GetMapping("/findallbooks")
public List<Book> getbooks(){
return Repository.findAll();
}
@GetMapping("/findallbooks/{id}")
public Optional<Book> getbook(@PathVariable int id){
return Optional.empty();
}
@DeleteMapping("/delete/{id}")
public String deletebook(@PathVariable int id){
repository.deleteById(id);
return "Book Deleted" +id;
}
}