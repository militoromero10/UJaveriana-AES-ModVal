package edu.javeriana.patterns.twitter.controller;

import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.service.BookService;
import edu.javeriana.patterns.twitter.service.TweetService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;
import java.util.Optional;

@Controller("/books")
public class BookController {

    private final BookService bookService;
    private final TweetService tweetService;

    public BookController(BookService bookService, TweetService tweetService) {
        this.bookService = bookService;
        this.tweetService = tweetService;
    }

    @Get
    public List<Book> listAll() {
        return bookService.listAll();
    }

    @Get("/{isbn}")
    Optional<Book> findBook(String isbn) {
        return bookService.findByIsbn(isbn);
    }

    @Get("/produce")
    void produceTweets(){
        tweetService.readTweets();
    }
}