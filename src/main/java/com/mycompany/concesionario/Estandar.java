/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase encragada de contener los vehiculos estandar y sus atributos
 *
 * @author orlando
 * @version 1.0
 */
public class Estandar extends Vehiculo {

    /**
     * Variable encargada de indicar las velocidades del vehiculo
     */
    private int velocidades;

    /**
     * Constructor encardo de recibir atributos del padre vehiculo e inicilizar
     * atributos propios
     *
     * @param velocidades indica las velocidades del vehiculo
     * @param marca indica la marca del vehiculo
     * @param referencia indica la referencia del vehiculo
     * @param color indica el color de vehiculo
     * @param modelo indica el modelo del vehiculo
     * @param precio indica el costo del vehiculo
     * @param asientos indica cantidad de sillas que posee el vehiculo
     * @param alimentacion indica el combustibles que usa el vehiculo
     * @param transmision inidica el numero de transmisiones que tiene el
     * vehiculo
     * @param numRuedas indica cantidad de ruebas del vehiculo
     * @param cantidad indica la cantidad de vehiculos que existen de esa marca modelo y referencia
     */
    public Estandar(int velocidades, String marca, String referencia, String color, int modelo, String alimentacion, String transmision, int numRuedas, float precio, int asientos, int cantidad) {
        super("Estandar", marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        this.velocidades = velocidades;
    }

}
