package com.sindocker.parcial.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @Column(nullable=false)
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanVenganza planVenganza;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MediaType tipo;
    @Column(nullable = false)
    private String url;
    private String caption;
}
