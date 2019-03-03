/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase maquinaria se encarga de contener todos los vehiculos de carga
 * @author orlando
 * @version 1.0
 */
public class Maquinaria extends Vehiculo{
    /**
     * Variable encargada de indicar la capcidad de carga en toneldas del vehiculo
     */
    private int capacidadCarga;
    /**
     * Variable encargada de indicar las velocidades del vehiculo
     */
    private int velocidades;
    /**
     * Contructor encargado de recibir los atributos de la clase padre vehiculo e inicializar los propios
     * @param capacidadCarga indica capacidad en toneladas soportadas por el vehiculo
     * @param velocidades indica las velocidades del vehiculo
     * @param marca indica la marca del vehiculo
     * @param referencia indica la referencia del vehiculo
     * @param color indica el color de vehiculo
     * @param modelo indica el modelo del vehiculo
     * @param precio indica el costo del vehiculo
     * @param asientos indica cantidad de sillas que posee el vehiculo
     * @param alimentacion indica el combustibles que usa el vehiculo
     * @param transmision inidica el numero de transmisiones que tiene el vehiculo
     * @param numRuedas indica cantidad de ruebas del vehiculo
     * @param categoria indica la categoria del vehiculo
     */
    public Maquinaria(int capacidadCarga, int velocidades, String marca, String referencia, String color, int modelo, float precio, int asientos, String alimentacion, String transmision, int numRuedas, String categoria) {
        super(marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        this.capacidadCarga = capacidadCarga;
        this.velocidades = velocidades;
    }

    
     
    
}
