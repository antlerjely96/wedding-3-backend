package org.example.wedding3backend.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.*;

@Entity
@Table(name = "reports")
@Data
public class RsvpReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Column(name = "guest_of")
    private String guestOf;

    private String attending;

    @Column(columnDefinition = "TEXT")
    private String message;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
    }
}
