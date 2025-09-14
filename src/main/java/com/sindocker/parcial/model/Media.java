package com.sindocker.parcial.model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="planvenganza_id", nullable=false)
    private PlanVenganza planVenganza;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MediaType tipo;
    @Column(nullable = false)
    private String url;
    private String caption;
}
