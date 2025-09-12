package com.sindocker.parcial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "hptas")
public class Hptas {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable=false)
    private String nombre;
    private String apodo;
//los enums los sacamos de este indio: https://www.youtube.com/watch?v=8c3-P8jG3fQ&ab_channel=KBTutorials
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private Rol rol;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="clique_id", nullable=false)
    private Clique clique;
    private String razonDeBullying;
    @Column(nullable=false)
    private int nivelCanson;

}
