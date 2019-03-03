/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;

/**
 *
 * @author orlan
 */
public class Ventas {
    
    public ArrayList<Vehiculo> comprarVehiculo(ArrayList<Vehiculo>listaVehiculos){
        int num=0;
        for(Vehiculo lista: listaVehiculos){
            System.out.println(num+ ". Vehiculo marca: "+lista.getMarca()+", referencia: "+lista.getReferencia());            
            num++;
        }
        
        return listaVehiculos;
    }
}
