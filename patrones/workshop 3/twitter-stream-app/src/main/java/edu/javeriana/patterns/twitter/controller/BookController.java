package edu.javeriana.patterns.twitter.controller;

import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;
import java.util.Optional;

@Controller("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get
    public List<Book> listAll() {
        return bookService.listAll();
    }

    @Get("/{isbn}")
    Optional<Book> findBook(String isbn) {
        return bookService.findByIsbn(isbn);
    }
}