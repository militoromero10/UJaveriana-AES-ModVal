package edu.javeriana.patterns.twitter.repository;

import edu.javeriana.patterns.twitter.model.Book;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface BookRepository extends PageableRepository<Book, Long> {
}
