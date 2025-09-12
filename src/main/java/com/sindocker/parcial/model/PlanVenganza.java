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
@Table(name = "planvenganza")
public class PlanVenganza {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable=false)
    private String titulo;
    private String descripcion;
    @Column(nullable=false)
    @ManyToOne
    @JoinColumn(name="hptas_id", nullable=false)
    private Hptas hpta;
    @Column(nullable=false)
    private Boolean esEjecutado;
    @Column(nullable=false)
    private LocalDate diaPlaneado;
    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private NiveldeExito niveldeExito;
}
