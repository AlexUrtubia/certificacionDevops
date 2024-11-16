package main.java.com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/")
    public String holaMundo() {
        return "Hola Mundo!";
    }
}
