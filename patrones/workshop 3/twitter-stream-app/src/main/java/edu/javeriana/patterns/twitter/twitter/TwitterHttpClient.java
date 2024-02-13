package edu.javeriana.patterns.twitter.twitter;

import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

import java.util.List;

@Client(id = "api.twitter.com")
@Header(name = "Authorization", value = "Bearer AAAAAAAAAAAAAAAAAAAAANpWsQEAAAAA128D7WMQbNnNmNSFVHqOh0eDtr8%3DFm5D26Gd9xbrvSEB4E6JRDOwzCgmFyEoFXExxRqIReOxM7vNgu")
public interface TwitterHttpClient {

    @Get("/2/tweets/search/stream")
    @SingleResult
    Publisher<List<HttpResponse<String>>> fetchReleases();
}
