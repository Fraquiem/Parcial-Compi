package com.sindocker.parcial.dao;

import com.sindocker.parcial.model.Clique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICliqueDAO extends JpaRepository<Clique, Long> {
}
