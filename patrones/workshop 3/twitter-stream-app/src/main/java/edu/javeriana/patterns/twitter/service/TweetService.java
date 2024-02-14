package edu.javeriana.patterns.twitter.service;

import edu.javeriana.patterns.twitter.model.Book;
import edu.javeriana.patterns.twitter.queue.AnalyticsClient;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
@Singleton
public class TweetService {

    private final AnalyticsClient analyticsClient;

    public TweetService(AnalyticsClient analyticsClient) {
        this.analyticsClient = analyticsClient;
    }

    public void readTweets(){
        try (var in = new BufferedReader(new FileReader("file.in"))) {
            for (String message; (message = in.readLine()) != null; ) {
                var book = new Book("asdf", message);
                analyticsClient.updateAnalytics(book);
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
