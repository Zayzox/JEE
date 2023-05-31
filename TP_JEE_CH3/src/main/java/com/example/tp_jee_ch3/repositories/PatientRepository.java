package com.example.tp_jee_ch3.repositories;

import com.example.tp_jee_ch3.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Long> {
}
