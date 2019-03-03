/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;

/**
 *Clase listas encargada de contener las listas de vehiculos facturas y usuarios
 * @author orlando
 * @version 1.0
 */
public class Listas {
    /**
     * Lista de vehiculos disponibles en el concesionario
     */
    ArrayList<Vehiculo> vehiculos;
    /**
     * Lista de facturas existentes en el sistema durante su ejecucion
     */
    ArrayList<Factura> facturas;
    /**
     * Lista de usuarios existentes en el sistema
     */
    ArrayList<Usuarios> usuarios;
    /**
     * Constructor encargado de incializar todas las listas
     * @param vehiculo indica la listas de vehiculos
     * @param facturas indica la lista de facturas
     * @param usuarios indica la lista de usuarios
     */
    public Listas(ArrayList<Vehiculo> vehiculo,ArrayList<Factura> facturas, ArrayList<Usuarios> usuarios) {
        this.vehiculos=vehiculo;
        this.facturas=facturas;
        this.usuarios=usuarios;
    }

    

    
}
