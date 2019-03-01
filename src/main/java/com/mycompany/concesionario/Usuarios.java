/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *
 * @author orlan
 */
public class Usuarios {
    protected String nombre;
    protected String apellido;
    protected float documento;

    public Usuarios(String nombre, String apellido, float documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getDocumento() {
        return documento;
    }

    public void setDocumento(float documento) {
        this.documento = documento;
    }
    
}
