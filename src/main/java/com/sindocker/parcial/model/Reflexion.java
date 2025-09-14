package com.sindocker.parcial.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "reflexion")
public class Reflexion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private LocalDate fecha;
    @Column(nullable=false)
    private int nivelEmocional;
    private String nota;
}
