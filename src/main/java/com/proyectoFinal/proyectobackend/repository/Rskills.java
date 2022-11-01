package com.proyectoFinal.proyectobackend.repository;

import com.proyectoFinal.proyectobackend.entity.skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rskills extends JpaRepository<skills, Integer> {

    Optional<skills> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
