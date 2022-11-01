package com.proyectoFinal.proyectobackend.Interface;

import com.proyectoFinal.proyectobackend.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos po ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);

    public static class getPersona {

        public getPersona() {
        }
    }
}
