package de.pokefred.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<String> up() {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(null);
    }
}
