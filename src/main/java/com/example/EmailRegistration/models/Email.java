package com.example.EmailRegistration.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String body;
    private LocalDateTime date_sent;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EmailUser receiverEmail;
}
