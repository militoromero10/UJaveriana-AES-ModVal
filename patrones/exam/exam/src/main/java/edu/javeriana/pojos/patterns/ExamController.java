package edu.javeriana.pojos.patterns;

import io.micronaut.http.annotation.*;

@Controller("/exam")
public class ExamController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}