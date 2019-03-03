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
 *Clase factura encargada de crear facturas
 * @author orlan
 * @version 1.0
 */
public class Factura {
    /**
     * Variable que indica el valor total de la compra
     */
    private double valorTotal; 
    /**
     * Variable que indica el valor de la compra antes de impuestos
     */
    private double subTotal;
    /**
     * Variable que almacena el procentaje de iva que se aplica a cada compra
     */
    public final double iva=0.19;
    /**
     * Variable que contienen el nombre del cliente
     */
    private String nomCliente;
    /**
     * Variable que contiene la descripcion completa de la compra que se acaba de realizar
     */
    private String descripcion;
    /**
     * Variable que contiene el enombre del empleado
     */
    private String nomEmpleado;
    /**
     * Variable que contiene la fecha y hora en la que se realizo la compra
     */
    private Date fecha;
    /**
     * Variable que contiene la marca del auto que se va ha comprar
     */
    private String marca;
    /**
     * Variable que contiene el numero del vehiculo, una especia de identificador por marca y referencia
     */
    public int numeroVehiculo;
    /**
     * metodo inicializador de factura
     */
    public Factura() {
    }
    /**
     * Constructor que contiene los atributo de la factura y contruye la factura
     * @param nomCliente indica el nombre del cliente
     * @param empleado inidica en numero de empleado que se selecciono
     * @param listas indica las listas en clase lista usada para llamar las lista vehiculo para formar la factura
     * @param cantidadVehiculos indica cuantos vehiculos se compraron
     * @param numVehiculo indica en numero del vehiculo, especie de identificador del vehiculo comprado
     */
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
        this.numeroVehiculo=numVehiculo;
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
       
    }
    
    /**
     * metodo sin retorno encargado llamar las listas de usuarios y ventas
     * @param user indica la lista de usuarios
     * @param venta indica la lista de ventas
     */
    public void mostrarFactura(ArrayList<Usuarios> user, ArrayList<Ventas> venta){
        
    }

    
}
