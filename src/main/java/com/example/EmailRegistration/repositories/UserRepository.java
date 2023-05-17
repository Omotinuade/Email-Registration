package com.example.EmailRegistration.repositories;

import com.example.EmailRegistration.models.EmailUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<EmailUser, Long>{
}
