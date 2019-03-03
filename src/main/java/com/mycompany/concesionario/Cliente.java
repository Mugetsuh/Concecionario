/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *Clase que contiene los atributos del cliente y sus acciones
 * @author orlando
 * @version 1.0
 */
public class Cliente extends Usuarios{
    /**
     * Contructor encragado de recibir los atributos de la clase padre usuario
     * @param  nombre indica el nombre del cliente
     * @param apellido indica el apellido del cliente
     * @param documento indica el numero de documento del cliente
     */
    public Cliente(String nombre, String apellido, float documento) {
        super(nombre, apellido, documento);
    }
    
}
