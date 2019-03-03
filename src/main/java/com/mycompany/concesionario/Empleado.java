/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *Clase encargada de contener los atributos del usuario empleado vendedor
 * @author orlando
 * @version 1.0
 */
public class Empleado extends Usuarios{
    /**
     * Contructor encargado de recibir los atributos de la clase padre usuario
     * @param  nombre indica el nombre del empleado vendedor
     * @param apellido indica el apellido del empleado vendedor
     * @param documento indica el numero de documento del empleado vendedor
     */
    public Empleado(String nombre, String apellido, float documento) {
        super(nombre, apellido, documento);
    }
    
}
