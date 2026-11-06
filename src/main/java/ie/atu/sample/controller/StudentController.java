package ie.atu.sample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @PostMapping("/name")
    public String name(@RequestParam String name) {
        return null;
    }

    @GetMapping("/room")
        public String room(@RequestParam String name) {
        return null;
    }
}