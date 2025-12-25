package org.example.wedding3backend.controller;

import org.example.wedding3backend.entity.RsvpReport;
import org.example.wedding3backend.repository.RsvpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rsvp")
public class RsvpController {
    @Autowired
    private RsvpRepository rsvpRepository;

    @PostMapping
    public ResponseEntity<?> createRsvp(@RequestBody RsvpReport report){
        try {
            RsvpReport saveData = rsvpRepository.save(report);
            return ResponseEntity.ok(saveData);
        } catch (Exception e){
            return ResponseEntity.internalServerError().body("Lỗi: " + e.getMessage());
        }
    }
}
