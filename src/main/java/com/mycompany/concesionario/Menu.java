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
    Scanner sc = new Scanner(System.in);
    ArrayList<Vehiculo> listaVehiculo; 
    /**
     * metodo sin retorno usado para inicializar la lista de vehiculos
     */
    public void iniciar(){
        listaVehiculo=new ArrayList<>();
        principal(listaVehiculo);
    }
    /**
     * metodo sin retorno encargado de mostrar menu al usuario con posibles actividades ha realizar
     * @param listaVehiculo indica el listado de vehiculos disponibles.
     */
    public void principal(ArrayList<Vehiculo> listaVehiculo){
        Inventario inv=new Inventario();
        int opcion = 0;
        System.out.println("Bienvenido al concesionario UdeC.");
        System.out.println("Que actividad desea realizar: ");
        System.out.println("1. Agregar Vehiculo.");
        System.out.println("2. Comprar Vehiculo.");
        System.out.println("3. Ver Vehiculo más Vendido.");
        System.out.println("4. Ver Vehiculo menos Vendido.");
        System.out.println("Digite la opcion: ");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                listaVehiculo=inv.agregar(listaVehiculo);
                break;
            case 2:
                //ventas
                break;
            case 3:
                //vehiculo mas vendido
                break;
            case 4:
                break;
            default:
                principal(listaVehiculo);
            
        }
        
    }
}
