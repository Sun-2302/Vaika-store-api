package com.hei.vaikastoreapi.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Configuration {
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int place_number;
    private int power;

}
