package com.proyectoFinal.proyectobackend.security.service;

import com.proyectoFinal.proyectobackend.security.entity.Rol;
import com.proyectoFinal.proyectobackend.security.enums.RolNombre;
import com.proyectoFinal.proyectobackend.security.repository.RolRespository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRespository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
