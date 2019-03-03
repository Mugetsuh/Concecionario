/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author orlan
 */
public class Ventas {

    Scanner sc = new Scanner(System.in);
    String nombre, apellido;
    float documento;
    Listas listas;

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
