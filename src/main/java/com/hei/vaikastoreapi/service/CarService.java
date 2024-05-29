package com.hei.vaikastoreapi.service;

import com.hei.vaikastoreapi.model.Car;
import com.hei.vaikastoreapi.repository.CarRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private CarRepository repository;

    @Transactional
    public Car save(Car toSave) {
        return repository.save(toSave);
    }

    @Transactional
    public Car getById(String id) {
        return repository.getReferenceById(id);
    }

    @Transactional
    public List<Car> findAll() {
        return repository.findAll();
    }
}
