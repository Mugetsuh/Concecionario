/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author orlan
 */
public class Factura {
    private double valorTotal, subTotal;
    public final double iva=0.19;
    private String nomCliente;
    private String descripcion;
    private String nomEmpleado;
    private Date fecha;
    private String marca;

    public Factura() {
    }

    public Factura(String nomCliente, int empleado, Listas listas, int cantidadVehiculos,int numVehiculo) {
        this.valorTotal=listas.vehiculos.get(numVehiculo).precio*cantidadVehiculos+listas.vehiculos.get(numVehiculo).precio*cantidadVehiculos*iva;
        this.subTotal=listas.vehiculos.get(numVehiculo).precio*cantidadVehiculos;
        this.nomCliente=nomCliente;
        this.marca=listas.vehiculos.get(numVehiculo).marca;
        this.descripcion=(numVehiculo+" marca: "+marca+
                          ", referencia: "+listas.vehiculos.get(numVehiculo).referencia+
                          ", color: "+listas.vehiculos.get(numVehiculo).color+
                          ", Modelo: "+listas.vehiculos.get(numVehiculo).modelo);
        this.nomEmpleado=listas.usuarios.get(empleado).nombre+" "+listas.usuarios.get(empleado).apellido;
        this.fecha=new Date();
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
       
    }
    
    
    public void mostrarFactura(ArrayList<Usuarios> user, ArrayList<Ventas> venta){
        
    }

    
}
