/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase encargada de mostrar al usuario las posibles actividades que puede
 * realizar.
 *
 * @author orlando
 * @version 1.0
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    Listas listas;
    ArrayList<Vehiculo> vehiculos;
    ArrayList<Factura> facturas;
    ArrayList<Usuarios> usuarios;

    /**
     * metodo sin retorno usado para inicializar la lista de vehiculos
     */
    public void iniciar() {
        listas = new Listas(vehiculos, facturas, usuarios);
        principal(listas);
    }

    /**
     * metodo sin retorno encargado de mostrar menu al usuario con posibles
     * actividades ha realizar
     *
     * @param listas indica el listado de vehiculos disponibles.
     */
    public void principal(Listas listas) {
        Inventario inv = new Inventario();
        Ventas venta = new Ventas();
        int opcion = 0;
        do {
            System.out.println("Bienvenido al concesionario UdeC.");
            System.out.println("Que actividad desea realizar: ");
            System.out.println("1. Agregar Vehiculo.");
            System.out.println("2. Comprar Vehiculo.");
            System.out.println("3. Ver Vehiculo más Vendido.");
            System.out.println("4. Ver Vehiculo menos Vendido.");
            System.out.println("5. Terminar");
            System.out.println("Digite la opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    listas = inv.agregar(listas);
                    break;
                case 2:
                    listas = venta.comprarVehiculo(listas);
                    break;
                case 3:
                    //vehiculo mas vendido
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("hasta la proxima");
                    break;
                default:
                    principal(listas);

            }
        } while (opcion != 5);
    }
}
