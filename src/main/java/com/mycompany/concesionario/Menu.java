/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase encargada de mostrar al usuario las posibles actividades que puede realizar.
 * @author orlando
 * @version 1.0
 */
public class Menu {
    /**
     * Variable encargada de leer los digitado en consola
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Variable encargada de llamar al objeto listas que contiene todas las listas (usuarios, vehiculos y facturas)
     */
    Listas listas;
    /**
     * variable para incializar la lista de vehiculos
     */
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    /**
     * Variable para inicializar la lista de facturas
     */
    ArrayList<Factura> facturas = new ArrayList<>();
    /**
     * Variable para inicializar la lista de usuarios
     */
    ArrayList<Usuarios> usuarios = new ArrayList<>();

    /**
     * metodo sin retorno usado para inicializar la lista de vehiculos, facturas y usuarios y enviar al main para ejecutar el programa
     */
    public void iniciar() {
        listas = new Listas(vehiculos, facturas, usuarios);
        usuarios();
        vehiculo();
        principal(listas);
    }
    /**
     * metodo sin retorno usado para agregar por defecto dos empleados del concesionario a la lista de usuarios
     */
    public void usuarios() {
        Empleado emp1 = new Empleado("Orlando", "Mora", 1234567);
        Empleado emp2 = new Empleado("Angie", "Paez", 78901);
        listas.usuarios.add(emp1);
        listas.usuarios.add(emp2);
    }
    /**
     * metodo sin retorno usado para dejar por defecto carros en la lista de vehiculos
     */
    public void vehiculo() {
        Vehiculo carro1 = new Estandar(5, "chevrolet", "spark", "rojo", 2019, "gasolina", "manual", 4, 2500000, 4, 4);
        Vehiculo carro2 = new Estandar(5, "volvo", "x", "amarillo", 2019, "electrico", "manual", 4, 500000, 4, 10);
        Vehiculo carro3 = new Estandar(5, "mazda", "3", "blanco", 2019, "electrico", "manual", 4, 500000, 4, 20);
        listas.vehiculos.add(carro1);        
        listas.vehiculos.add(carro2);
        listas.vehiculos.add(carro3);
    }
    /**
     * metodo sin retorno usado para saber cual es el vehiculo mas vendido he imprimir el reporte
     */
    public void vehiculoMasVendido() {
        int [] numVen= new int [listas.vehiculos.size()];
        int numero = 0;
        Factura fac = new Factura();
        for (int j=0;j<listas.vehiculos.size();j++) {
            for (int i = 0; i < listas.facturas.size(); i++) {
                numero = listas.facturas.get(i).numeroVehiculo;
                if (j==numero) {
                    numVen[j]++;
                }
            }
        }
        numero=0;
        int posicion=0;
        for (int x=0; x<numVen.length;x++){
            if(numVen[x]>numero){
                numero=numVen[x];
                posicion=x;
            }
        }
        System.out.println("Reporte Vehiculos mas vendido");
        System.out.println("El vehiculo mas vendido es: "+listas.vehiculos.get(posicion).marca+" "+listas.vehiculos.get(posicion).referencia);
    }
    /**
     * metodo sin retorno usado para saber cual es el vehiculo menos vendido he imprimir el reporte
     */
     public void vehiculoMenosVendido() {
        int [] numVen= new int [listas.vehiculos.size()];
        int numero = 0;
        Factura fac = new Factura();
        for (int j=0;j<listas.vehiculos.size();j++) {
            for (int i = 0; i < listas.facturas.size(); i++) {
                numero = listas.facturas.get(i).numeroVehiculo;
                
                if (j==numero) {
                    numVen[j]++;
                }
            }
        }
        numero=5;
        int posicion=0;
        for (int x=0; x<numVen.length;x++){
            if(numVen[x]<numero){
                numero=numVen[x];
                posicion=x;
            }
        }
        System.out.println("Reporte Vehiculos menos vendido");
        System.out.println("El vehiculo menos vendido es: "+listas.vehiculos.get(posicion).marca+" "+listas.vehiculos.get(posicion).referencia);
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
                    vehiculoMasVendido();
                    break;
                case 4:
                    vehiculoMenosVendido();
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
