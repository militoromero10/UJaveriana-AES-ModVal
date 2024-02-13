package edu.javeriana.patterns.twitter.service;

import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.model.BookAnalytics;
import edu.javeriana.patterns.twitter.repository.BookRepository;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Singleton;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Singleton
@RequiredArgsConstructor
public class AnalyticsService {

    private final BookRepository bookRepository;
    private final Map<Book, Long> bookAnalytics = new ConcurrentHashMap<>();

    public void updateBookAnalytics(final Book book) {
        bookAnalytics.compute(book, (b, v) -> {
            bookRepository.save(book);
            return v == null ? 1L : v + 1;
        });
    }

    public List<BookAnalytics> listAnalytics() {
        return bookAnalytics
                .entrySet()
                .stream()
                .map(e -> new BookAnalytics(e.getKey().getIsbn(), e.getValue()))
                .collect(Collectors.toList());
    }

    public Optional<Book> getById(final long id) {
        return bookRepository.findById(id);
    }

    public List<Book> list(@Valid Pageable pageable) {
        return bookRepository.findAll(pageable).getContent();
    }

}