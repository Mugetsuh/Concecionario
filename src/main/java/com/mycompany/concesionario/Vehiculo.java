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
public class Vehiculo {
    
    protected String categoria;
    protected String marca;
    protected String referencia;
    protected String color;
    protected int modelo;
    protected String alimentacion;
    protected String transmision;
    protected int numRuedas;
    protected float precio;
    protected int asientos;
    protected int cantidad;

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
