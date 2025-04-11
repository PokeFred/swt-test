package de.pokefred.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class MonitoringController {
    @GetMapping("/up")
    public ResponseEntity<String> up() {
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
        int minutes = (int) uptime / 1000 / 60;

        String message = String.format("Application running since %d minutes.", minutes);
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(message);
    }
}
