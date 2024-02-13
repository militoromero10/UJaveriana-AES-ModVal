package edu.javeriana.patterns.twitter.queue;


import edu.javeriana.patterns.twitter.model.Book;
import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient("micronaut")
public interface AnalyticsClient {

    @Binding("analytics")
    void updateAnalytics(Book book);
}