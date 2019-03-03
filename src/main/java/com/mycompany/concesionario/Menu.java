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
public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Vehiculo> listaVehiculo; 
    public void iniciar(){
        listaVehiculo=new ArrayList<>();
        principal(listaVehiculo);
    }
    
    public void principal(ArrayList<Vehiculo> listaVehiculo){
        Inventario inv=new Inventario();
        Ventas venta =new Ventas();
        int opcion = 0;
        do{
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
                listaVehiculo=venta.comprarVehiculo(listaVehiculo);
                break;
            case 3:
                //vehiculo mas vendido
                break;
            case 4:
                break;
            default:
                principal(listaVehiculo);
            
        }
        }while(opcion!=5);
        
    }
}
