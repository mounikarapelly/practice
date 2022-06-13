package packagecom.example.demo.repository;

import java.awt.print.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer>{

 

}
