package com.sindocker.parcial.dao;

import com.sindocker.parcial.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMediaDAO extends JpaRepository<Media, Long> {
}
