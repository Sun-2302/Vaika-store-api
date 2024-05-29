package com.hei.vaikastoreapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import static jakarta.persistence.FetchType.LAZY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"image\"")
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Image {
    @Id
    private String id;
    private String url;
    @ManyToOne(fetch =LAZY)
    @JoinColumn(name = "car_id")
    private Car car;
}
