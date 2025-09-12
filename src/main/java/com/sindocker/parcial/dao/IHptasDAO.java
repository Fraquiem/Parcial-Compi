package com.sindocker.parcial.dao;

import com.sindocker.parcial.model.Hptas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IHptasDAO extends JpaRepository<Hptas, Long> {
    Optional<Hptas> findHptasById(Long id);
}
