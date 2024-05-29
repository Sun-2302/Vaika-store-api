package com.hei.vaikastoreapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hei.vaikastoreapi.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.LAZY;


@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "\"car\"")
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private double price;
    @Enumerated(STRING)
    private Status status;
    private String type;
    @Embedded
    private Configuration configuration;
    @OneToMany(mappedBy = "car", fetch = LAZY, cascade = ALL)
    private List<Image> imageList;
}
