package com.proyectoFinal.proyectobackend.security.repository;

import com.proyectoFinal.proyectobackend.security.entity.Rol;
import com.proyectoFinal.proyectobackend.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRespository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
