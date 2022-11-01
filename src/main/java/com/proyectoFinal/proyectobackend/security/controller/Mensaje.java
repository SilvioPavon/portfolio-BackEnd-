package com.proyectoFinal.proyectobackend.security.controller;

public class Mensaje {
 private String mensaje;
 
 //Contructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
 
   //Getter y Setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
