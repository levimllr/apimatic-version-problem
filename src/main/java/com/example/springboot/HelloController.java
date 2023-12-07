package com.example.springboot;

import com.squareup.square.SquareClient;
import com.squareup.square.SquareClientInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final SquareClientInterface squareClient;

  public HelloController() {
    this.squareClient = new SquareClient.Builder().build();
  }

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}