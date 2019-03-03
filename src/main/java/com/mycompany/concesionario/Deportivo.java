/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase encarga de contener los atributos y acciones de los vehiculos
 * deportivos
 *
 * @author orlando
 * @version 1.0
 */
public class Deportivo extends Vehiculo {

    /**
     * Variable encargada de indicar si es comvertible o no el vehiculo
     * deportivo
     */
    protected String convertible;

    /**
     * Contructor encargado de recibir de la clase padre vehiculo los atributos
     * e inicializar los propios
     *
     * @param convertible indica si se trata de un vehiculo convertible o no
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
     * @param categoria indica la categoria del vehiculo
     */
    public Deportivo(String convertible, String categoria, String marca, String referencia, String color, int modelo, String alimentacion, String transmision, int numRuedas, float precio, int asientos, int cantidad) {
        super(categoria, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        this.convertible = convertible;
    }

}
