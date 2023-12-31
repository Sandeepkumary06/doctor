package com.example.DoctorApp.controller;

import com.example.DoctorApp.model.Appointment;
import com.example.DoctorApp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }
}
