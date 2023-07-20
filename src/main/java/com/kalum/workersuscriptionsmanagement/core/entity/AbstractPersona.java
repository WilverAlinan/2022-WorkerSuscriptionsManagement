package com.kalum.workersuscriptionsmanagement.core.entity;

import com.kalum.workersuscriptionsmanagement.core.interfaces.IAsistencia;

public abstract class AbstractPersona implements IAsistencia {

    private String apelllidos;
    private String nombres;
    private String direccion;
    private String telefono;
    private String email;

    public String getApelllidos() {
        return apelllidos;
    }

    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void enviarInformacionPorEmail(String mensaje);
    {

    }



}
