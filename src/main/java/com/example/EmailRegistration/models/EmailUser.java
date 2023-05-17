package com.example.EmailRegistration.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EmailUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String emailAddress;
    @NonNull
    private String password;
    @NonNull
    private String userName;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true )
    private Address address;
    @NonNull
    private String phoneNumber;
}
