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
public class Personalizado extends Vehiculo{
    
    private int alturaRin;
    private String formaPuertas;
    private String tubosEscape;

    public Personalizado(int alturaRin, String formaPuertas, String tubosEscape, String marca, String referencia, String color, int modelo, float precio, int asientos, String alimentacion, String transmision, int numRuedas, String categoria) {
        super(marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        this.alturaRin = alturaRin;
        this.formaPuertas = formaPuertas;
        this.tubosEscape = tubosEscape;
    }

    
    
    
}
