package com.sindocker.parcial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "clique")
public class Clique {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable=false)
    private String nombre;
    private String descripcion;
}
