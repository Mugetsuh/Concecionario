/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;

/**
 *
 * @author orlan
 */
public class Factura {
    private float valorTotal, subTotal, iva;
    private String tipoPago;
    ArrayList <Usuarios> user;

    public Factura(float valorTotal, float subTotal, float iva, String tipoPago, ArrayList<Usuarios> user) {
        this.valorTotal = valorTotal;
        this.subTotal = subTotal;
        this.iva = iva;
        this.tipoPago = tipoPago;
        this.user = user;
    }
    public void mostrarFactura(ArrayList<Usuarios> user, ArrayList<Ventas> venta){
        
    }
    
}
