package com.example.DoctorApp.repository;

import com.example.DoctorApp.model.AuthenticationToken;
import com.example.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
    AuthenticationToken findFirstByTokenValue(String authenticateToken);

    AuthenticationToken findFirstByPatient(Patient patient);
}
