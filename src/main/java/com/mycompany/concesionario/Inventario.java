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
public class Inventario {

    private int stockMin;
    private int cantidadVehiculo;
    Scanner sc = new Scanner(System.in);
    public Vehiculo vehiculo;


    String categoria, marca, referencia, color, alimentacion, transmision;
    int modelo, numRuedas, asientos, opcion, marchas;
    float precio;

    public ArrayList<Vehiculo> agregar(ArrayList<Vehiculo> listaVehiculos) {
        System.out.println("Menu para agregar un Vehiculo.");
        do {
            System.out.println("¿Que tipo de Vehiculo desea agregar? ");
            System.out.println("1. Estandar.");
            System.out.println("2. Maquinaria.");
            System.out.println("3. Deportivo.");
            System.out.println("4. Personalizado.");
            System.out.println("5. Salir.");
            System.out.print("Digite la opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    listaVehiculos = estandar(listaVehiculos);
                    break;
                case 2:
                    listaVehiculos = maquinaria(listaVehiculos);
                    break;
                case 3:
                    listaVehiculos = deportivo(listaVehiculos);
                    break;
                case 4:
                    listaVehiculos=personalizado(listaVehiculos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
        return listaVehiculos;
    }

    private ArrayList<Vehiculo> estandar(ArrayList<Vehiculo> listaVehiculos) {
        categoria = "Estandar";
        System.out.println("Solicitud de Datos para Vehiculo " + categoria);
        System.out.println("Digite la Marca del Vehiculo: ");
        marca = sc.next();
        System.out.println("Digite la Referencia del Vehiculo: ");
        referencia = sc.next();
        System.out.println("Digite el Color del Vehiculo:");
        color = sc.next();
        System.out.println("Digite el Modelo del Vehiculo: ");
        modelo = sc.nextInt();
        System.out.println("Digite el tipo de Alimentacion del Vehiculo: ");
        alimentacion = sc.next();
        System.out.println("Digite el tipo de Transmision del vehiculo: ");
        transmision = sc.next();
        System.out.println("Digite cantidad de Ruedas: ");
        numRuedas = sc.nextInt();
        System.out.println("Digite el Precio del Vehiculo: ");
        precio = sc.nextFloat();
        System.out.println("Digite el Numero de Asientos del vehiculo: ");
        asientos = sc.nextInt();
        System.out.println("Digite la Cantidad de Marchas del Vehiculo");
        marchas = sc.nextInt();
        vehiculo = new Estandar(marchas, marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        listaVehiculos.add(vehiculo);
        return listaVehiculos;
    }

    private ArrayList<Vehiculo> maquinaria(ArrayList<Vehiculo> listaVehiculos) {
        categoria = "Maquinaria";
        System.out.println("Solicitud de Datos para Vehiculo " + categoria);
        System.out.println("Digite la Marca del Vehiculo: ");
        marca = sc.next();
        System.out.println("Digite la Referencia del Vehiculo: ");
        referencia = sc.next();
        System.out.println("Digite el Color del Vehiculo:");
        color = sc.next();
        System.out.println("Digite el Modelo del Vehiculo: ");
        modelo = sc.nextInt();
        System.out.println("Digite el tipo de Alimentacion del Vehiculo: ");
        alimentacion = sc.next();
        System.out.println("Digite el tipo de Transmision del vehiculo: ");
        transmision = sc.next();
        System.out.println("Digite cantidad de Ruedas: ");
        numRuedas = sc.nextInt();
        System.out.println("Digite el Precio del Vehiculo: ");
        precio = sc.nextFloat();
        System.out.println("Digite el Numero de Asientos del vehiculo: ");
        asientos = sc.nextInt();
        System.out.println("Digite la Capacidad de Carga del Vehiculo");
        int carga = sc.nextInt();
        System.out.println("Digite la Cantidad de Marchas del Vehiculo");
        marchas = sc.nextInt();
        vehiculo = new Maquinaria(carga, marchas, marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        listaVehiculos.add(vehiculo);
        return listaVehiculos;
    }

    private ArrayList<Vehiculo> deportivo(ArrayList<Vehiculo> listaVehiculos) {
        categoria = "Deportivo";
        System.out.println("Solicitud de Datos para Vehiculo " + categoria);
        System.out.println("Digite la Marca del Vehiculo: ");
        marca = sc.next();
        System.out.println("Digite la Referencia del Vehiculo: ");
        referencia = sc.next();
        System.out.println("Digite el Color del Vehiculo:");
        color = sc.next();
        System.out.println("Digite el Modelo del Vehiculo: ");
        modelo = sc.nextInt();
        System.out.println("Digite el tipo de Alimentacion del Vehiculo: ");
        alimentacion = sc.next();
        System.out.println("Digite el tipo de Transmision del vehiculo: ");
        transmision = sc.next();
        System.out.println("Digite cantidad de Ruedas: ");
        numRuedas = sc.nextInt();
        System.out.println("Digite el Precio del Vehiculo: ");
        precio = sc.nextFloat();
        System.out.println("Digite el Numero de Asientos del vehiculo: ");
        asientos = sc.nextInt();
        System.out.println("Digite si el Vehiculo es convertible T/F: ");
        Boolean convertible = sc.nextBoolean();
        vehiculo = new Deportivo(convertible, marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        listaVehiculos.add(vehiculo);
        return listaVehiculos;
    }

    private ArrayList<Vehiculo> personalizado(ArrayList<Vehiculo> listaVehiculos) {
        categoria = "Personalizado";
        System.out.println("Solicitud de Datos para Vehiculo " + categoria);
        System.out.println("Digite la Marca del Vehiculo: ");
        marca = sc.next();
        System.out.println("Digite la Referencia del Vehiculo: ");
        referencia = sc.next();
        System.out.println("Digite el Color del Vehiculo:");
        color = sc.next();
        System.out.println("Digite el Modelo del Vehiculo: ");
        modelo = sc.nextInt();
        System.out.println("Digite el tipo de Alimentacion del Vehiculo: ");
        alimentacion = sc.next();
        System.out.println("Digite el tipo de Transmision del vehiculo: ");
        transmision = sc.next();
        System.out.println("Digite cantidad de Ruedas: ");
        numRuedas = sc.nextInt();
        System.out.println("Digite el Precio del Vehiculo: ");
        precio = sc.nextFloat();
        System.out.println("Digite el Numero de Asientos del vehiculo: ");
        asientos = sc.nextInt();
        System.out.println("Digite la Altura del Rin del Vehiculo :");
        int altura = sc.nextInt();
        System.out.println("Digite la forma de abrir puertas del Vehiculo: ");
        String puertas = sc.next();
        System.out.println("digite la forma de los Tubos de Escape del Vehiculo: ");
        String tubos = sc.next();
        vehiculo = new Personalizado(altura, puertas, tubos, marca, referencia, color, modelo, precio, asientos, alimentacion, transmision, numRuedas, categoria);
        listaVehiculos.add(vehiculo);
        return listaVehiculos;
    }
}
