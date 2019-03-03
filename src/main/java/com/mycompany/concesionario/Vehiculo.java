/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *Clase padre vehiculo contiene los atributos comunes para deportivo, estandar, maquinariay perzonalizado hijos
 * @author orlando
 * @version 1.0
 */
public class Vehiculo {
    /**
     * VAriable que indica la categoria del auto
     */
    protected String categoria;
    /**
     * Variable que indica la marca del auto
     */
    protected String marca;
    /**
     * Variable que indica la referenciad el auto
     */
    protected String referencia;
    /**
     * Variable que indica el color del auto
     */
    protected String color;
    /**
     * Variable que indica el modelo del auto
     */
    protected int modelo;
    /**
     * Variable que indica la alimentacion del auto
     */
    protected String alimentacion;
    /**
     * Vartiable que indica transmision del vehiculo
     */
    protected String transmision;
    /**
     * Variable que indica el numero de ruedas del auto
     */
    protected int numRuedas;
    /**
     * Variable que indica el precio del auto
     */
    protected float precio;
    /**
     * Variable que indica las sillas del auto
     */
    protected int asientos;
    /**
     * Variable que indica la cantidad de autos 
     */
    protected int cantidad;
    /**
     * Conatructor que inicializa todos los atributos de las clase
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
     * @param cantidad indica la cantidad de autos perzonalizados en esa referencia y marca..
     */
    public Vehiculo(String categoria, String marca, String referencia, String color, int modelo, String alimentacion, String transmision, int numRuedas, float precio, int asientos, int cantidad) {
        this.categoria = categoria;
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.modelo = modelo;
        this.alimentacion = alimentacion;
        this.transmision = transmision;
        this.numRuedas = numRuedas;
        this.precio = precio;
        this.asientos = asientos;
        this.cantidad = cantidad;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
