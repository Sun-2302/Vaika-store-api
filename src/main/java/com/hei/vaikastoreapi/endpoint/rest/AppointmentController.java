package com.hei.vaikastoreapi.endpoint.rest;

import com.hei.vaikastoreapi.model.Appointment;
import com.hei.vaikastoreapi.repository.model.StatusAppointment;
import com.hei.vaikastoreapi.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.findAll();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }

    @PutMapping
    public void updateAppointment(@RequestBody StatusAppointment statusAppointment) {
        appointmentService.updateStatus(statusAppointment.getIdAppointment(), statusAppointment.getStatusAppointment());
    }

    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@PathVariable String id) {
        appointmentService.deleteAppointmentById(id);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable String id) {
        return appointmentService.getById(id);
    }


}
