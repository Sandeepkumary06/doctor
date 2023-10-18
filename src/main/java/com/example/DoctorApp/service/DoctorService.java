package com.example.DoctorApp.service;

import com.example.DoctorApp.model.Doctor;
import com.example.DoctorApp.repository.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    IDoctorRepo doctorRepo;

    public String addDoctor(Doctor doctor) {
        if(doctor != null){
            doctorRepo.save(doctor);
            return "doctor is added";
        }
        return "Not added";
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }
}
