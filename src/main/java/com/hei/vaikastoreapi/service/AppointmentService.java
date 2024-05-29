package com.hei.vaikastoreapi.service;

import com.hei.vaikastoreapi.exception.ResourceNotFoundException;
import com.hei.vaikastoreapi.model.Appointment;
import com.hei.vaikastoreapi.repository.AppointmentRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentService {
    private AppointmentRepository repository;

    @Transactional
    public Appointment save(Appointment toSave) {
        return repository.save(toSave);
    }

    public void updateStatus(String id, String status) {
        int updatedRows = repository.updateStatus(id, status);
        if (updatedRows == 0) {
            throw new ResourceNotFoundException("Appointment not found with id " + id);
        }
    }

    @Transactional
    public void deleteAppointmentById(String id) {
        repository.deleteById(id);
    }

    @Transactional
    public Appointment getById(String id) {
        return repository.getReferenceById(id);
    }

    @Transactional
    public List<Appointment> findAll() {
        return repository.findAll();
    }

}
