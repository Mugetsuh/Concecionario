/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;

/**
 * clase principal usada unicamente para llamar la clase menu
 * @author orlando y angie
 * @version 1.0
 */
public class Principal {

    /**
     * metodo estatico main para accionar el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m=new Menu();
        m.iniciar();
    }
    
}
