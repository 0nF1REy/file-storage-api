package br.com.alanryan.file_storage_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "message", "File Storage API is running!",
                "version", "1.0.0",
                "status", "OK"
        );
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}