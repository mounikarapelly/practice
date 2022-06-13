package springboot.model.repostory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer>{

	void save(java.awt.print.Book book);

	

	

	
}
