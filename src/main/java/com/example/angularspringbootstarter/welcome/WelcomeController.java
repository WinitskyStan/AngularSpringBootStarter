package com.example.angularspringbootstarter.welcome;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(name = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Welcome Controller", description = "REST API for getting random welcome messages")
public class WelcomeController {

    private final List<String> welcomeMessages = Arrays.asList(
            "Welcome to our service! We're glad you're here.",
            "Hello! Thanks for stopping by.",
            "Greetings! Hope you're having a great day.",
            "Hi there! Welcome aboard.",
            "Welcome! It's wonderful to see you.",
            "Hello and welcome! Make yourself at home.",
            "Hey! Thanks for visiting us.",
            "Welcome welcome! We're excited to have you here.",
            "Greetings and salutations!",
            "Hi! We're happy you're here with us today."
    );

    private final Random random = new Random();

    @GetMapping("/welcome")
    @Operation(
            summary = "Get a random welcome message",
            description = "Returns a random welcome message from the predefined list of greetings"
    )
    public WelcomeMessage getRandomWelcome() {
        String randomMessage = welcomeMessages.get(random.nextInt(welcomeMessages.size()));
        return new WelcomeMessage(randomMessage);
    }

}
