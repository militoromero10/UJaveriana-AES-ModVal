package edu.javeriana.patterns.twitter.controller;

import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.model.BookAnalytics;
import edu.javeriana.patterns.twitter.service.AnalyticsService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;
import java.util.Optional;

@Controller("/analytics")
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @Get
    public List<BookAnalytics> listAnalytics() {
        return analyticsService.listAnalytics();
    }

    @Get("/{id}")
    public Optional<Book> show(Long id) {
        return analyticsService.getById(id);
    }
}