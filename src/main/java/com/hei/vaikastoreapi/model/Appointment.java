package com.hei.vaikastoreapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static org.hibernate.annotations.SourceType.DB;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"appointment\"")
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Appointment {
    @Id
    private String id;
    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
    private String message;
    private String contact;
    @CreationTimestamp(source = DB)
    private Instant appointmentDate;
    private String status;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
