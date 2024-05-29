package com.hei.vaikastoreapi.endpoint.rest;

import com.hei.vaikastoreapi.model.Car;
import com.hei.vaikastoreapi.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
@AllArgsConstructor
public class CarController {
    private CarService carService;

    @GetMapping
    public List<Car> getAllCar() {
        return carService.findAll();
    }

    @PostMapping
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getById(id);
    }
}
