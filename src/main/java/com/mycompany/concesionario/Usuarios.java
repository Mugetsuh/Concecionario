/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *Clase padre usuario encargada de contener los datos y actividades de los usuario de sistema 
 * @author orlando
 */
public class Usuarios {
    /**
     * Variable que indica el nombre del usuario
     */
    protected String nombre;
    /**
     * Variable que indica el apellido del usuario
     */
    protected String apellido;
    /**
     * Variable que indica el numero de documento del usuario
     */
    protected float documento;
    /**
     * Contructor encargado de recibir e inicializar los atributos de los usuario del sistema
     * @param nombre indica el nombre del usuario
     * @param apellido indica el apellido del usuario
     * @param documento indica el numero de documento del usuario
     */
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
