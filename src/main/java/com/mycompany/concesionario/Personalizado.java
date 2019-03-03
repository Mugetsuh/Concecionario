/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * clase encargada que contiene los vehiculos personalizados
 *
 * @author orlando
 * @version 1.0
 */
public class Personalizado extends Vehiculo {

    /**
     * Variable encargada de indicar la altura de los rines en el vehiculo
     */
    private int alturaRin;
    /**
     * variables encaraga de describir como se abren las puertas en el vehiculo
     */
    private String formaPuertas;
    /**
     * Variable encarga de describir los tubos de escape en el vehiculo
     */
    private String tubosEscape;

    /**
     * Contructor recibe los aprametros de la clase padre vehiculo e inicializa
     * sus propios atributos
     *
     * @param alturaRin indica la altura de los rines en el vehiculo
     * @param formaPuertas indica como se abren las puertas
     * @param tubosEscape indica cuantos tubos de escape posee el vehiculo
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
    public Personalizado(int alturaRin, String formaPuertas, String tubosEscape, String categoria, String marca, String referencia, String color, int modelo, String alimentacion, String transmision, int numRuedas, float precio, int asientos, int cantidad) {
        super(categoria, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        this.alturaRin = alturaRin;
        this.formaPuertas = formaPuertas;
        this.tubosEscape = tubosEscape;
    }

}
