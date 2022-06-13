package com.cg.book1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.book1.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}