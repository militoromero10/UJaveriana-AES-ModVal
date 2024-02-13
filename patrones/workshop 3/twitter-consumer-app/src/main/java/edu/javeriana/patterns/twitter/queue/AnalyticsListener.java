package edu.javeriana.patterns.twitter.queue;


import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.service.AnalyticsService;
import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;


@RabbitListener
public class AnalyticsListener {

    private final AnalyticsService analyticsService;

    public AnalyticsListener(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @Queue("analytics")
    public void updateAnalytics(Book book) {
        analyticsService.updateBookAnalytics(book);
    }
}