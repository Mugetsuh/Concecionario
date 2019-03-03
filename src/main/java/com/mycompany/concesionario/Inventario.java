/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase Inventario esta clase contiene todo el inventario de carros existentes en el programa ademas cuenta con el stck de seguridad indicando cuando se debe realizar la compra de nuevos carros
 * @author orlando
 * @version 1.0
 */
public class Inventario {
    public final int stockMin=2;
    Scanner sc = new Scanner(System.in);
    public Vehiculo vehiculo;


    String categoria, marca, referencia, color, alimentacion, transmision;
    int modelo, numRuedas, asientos, opcion, marchas, cantidad;
    float precio;
    
    public Listas agregar(Listas listas) {
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
                    listas = estandar(listas);
                    break;
                case 2:
                    listas = maquinaria(listas);
                    break;
                case 3:
                    listas = deportivo(listas);
                    break;
                case 4:
                    listas=personalizado(listas);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Desea agreagar otro vehiculo s/n: ");
            
        } while (sc.next().charAt(0)=='s');
        return listas;
    }
    public Listas descontarAuto (Listas listas,int posicion, int cantidadVeh){
        listas.vehiculos.get(posicion).cantidad=listas.vehiculos.get(posicion).cantidad-cantidadVeh;
        if(listas.vehiculos.get(posicion).cantidad<=stockMin){
            System.err.println("Debe Solicitar Vehiculos de la marca:"+listas.vehiculos.get(posicion).marca+", de la referencia: "+
                    listas.vehiculos.get(posicion).referencia+", a su Proveedor");
        }
        return listas;
    }
    private Listas estandar(Listas listas) {
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
        System.out.println("Digite la Cantidad de Vehiculos que va ha ingresar de "+marca+": ");
        cantidad = sc.nextInt();
        vehiculo = new Estandar(marchas, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        listas.vehiculos.add(vehiculo);
        return listas;
    }

    private Listas maquinaria(Listas listas) {
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
        System.out.println("Digite el Numero de Asientos del  Vehiculo: ");
        asientos = sc.nextInt();
        System.out.println("Digite la Capacidad en Toneladas de Carga del Vehiculo");
        int carga = sc.nextInt();
        System.out.println("Digite la Cantidad de Marchas del Vehiculo");
        marchas = sc.nextInt();
        System.out.println("Digite la Cantidad de Vehiculos que va ha ingresar de "+marca+": ");
        cantidad = sc.nextInt();
        vehiculo = new Maquinaria(carga, marchas, categoria, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        listas.vehiculos.add(vehiculo);
        return listas;
    }

    private Listas deportivo(Listas listas) {
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
        System.out.println("Digite si el Vehiculo es convertible si/no: ");
        String convertible = sc.next();
        System.out.println("Digite la Cantidad de Vehiculos que va ha ingresar de "+marca+": ");
        cantidad = sc.nextInt();
        vehiculo = new Deportivo(convertible, categoria, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        listas.vehiculos.add(vehiculo);
        return listas;
    }

    private Listas personalizado(Listas listas) {
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
        System.out.println("Digite la Cantidad de Vehiculos que va ha ingresar de "+marca+": ");
        cantidad = sc.nextInt();
        vehiculo = new Personalizado(altura, puertas, tubos, categoria, marca, referencia, color, modelo, alimentacion, transmision, numRuedas, precio, asientos, cantidad);
        listas.vehiculos.add(vehiculo);
        return listas;
    }
}
