/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase ventas encargada de comprar auto
 * @author orlando
 * @version 1.0
 */
public class Ventas {
    /**
     * VAriable de lectura en consola
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Variables que indican el nombre y apellido del cliente
     */
    String nombre, apellido;
    /**
     * Varible que indica el numero de documento del cliente
     */
    float documento;
    /**
     * Variable encargada de llamar al objeto Listas
     */
    Listas listas;
    /**
     * metodo que retorna listas encargado de realizar la compra de auto y agregar la compra a la factura
     * @return Listas retorna lista con auto comprado descontado
     * @param listas indica que recibe le objeto listas donde estan contenidas todas las listas
     */
    public Listas comprarVehiculo(Listas listas) {
        this.listas=listas;
        int num = 0, empleado = 0;
        char opcion;
        do {
            System.out.println("Listado de Vehiculos Disponibles.");
            for (Vehiculo lista : listas.vehiculos) {
                System.out.println(num + ". Vehiculo marca: " + lista.getMarca() + ", referencia: " + lista.getReferencia());
                num++;
            }
            System.out.println("Digite el numero del Vehiculo desea comprar: ");
            int numVehiculo = sc.nextInt();
            System.out.println("Digite la cantidad de Unidades que desea comprar del vehiculo: "
                                + listas.vehiculos.get(numVehiculo).marca);
            int cantidadUnidades = sc.nextInt();
            empleado = mostrarUser(listas);
            datosCliente();
            Factura fac = new Factura(nombre + " " + apellido, empleado, listas, cantidadUnidades, numVehiculo);
            listas.facturas.add(fac);
            Inventario inv = new Inventario();
            listas = inv.descontarAuto(listas, numVehiculo, cantidadUnidades);
            
            
            
            
            System.out.println("Desea comprar otro vehiculo s/n: ");
            opcion=sc.next().charAt(0);
        } while (opcion=='s');

        return listas;
    }
    /**
     * metodo para que el cliente digite sus datos y agregar a la lista de usuarios
     */
    public void datosCliente() {
        System.out.println("Digite Nombre del cliente: ");
        nombre = sc.next();
        System.out.println("Digite Apellido del cliente: ");
        apellido = sc.next();
        System.out.println("Digite Documento del cliente: ");
        documento = sc.nextFloat();
        Cliente cliente = new Cliente(nombre, apellido, documento);
        listas.usuarios.add(cliente);
    }
    /**
     * metodo con retorno que retorna el numero del emplado que realizo la venta
     * @return int num indica el numero de vendedor que realizo la venta
     * @param listas objeto listas que recibe para acceder a la lista de usuarios
     * 
     */
    public int mostrarUser(Listas listas) {
        int num = 0;
        System.out.println("Listado de empleados.");
        for (Usuarios user : listas.usuarios) {
            System.out.println(num + ". Nombre: " + user.nombre + " " + user.apellido);
            num++;
        }
        System.out.println("Digite el numero del Empleado: ");
        num = sc.nextInt();
        return num;
    }
}
