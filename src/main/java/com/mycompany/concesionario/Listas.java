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
public class Listas {
    ArrayList<Vehiculo> vehiculos;
    ArrayList<Factura> facturas;
    ArrayList<Usuarios> usuarios;

    public Listas(ArrayList<Vehiculo> vehiculo,ArrayList<Factura> facturas, ArrayList<Usuarios> usuarios) {
        this.vehiculos=vehiculo;
        this.facturas=facturas;
        this.usuarios=usuarios;
    }

    

    
}
