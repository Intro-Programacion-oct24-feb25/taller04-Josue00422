/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema003;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema003 {

    public static void main(String[] args) {
         Scanner gastos = new Scanner(System.in);
        
        String nombre1;
        String nombre2;
        String nombre3;
        double hijo1;
        double hijo2;
        double hijo3;
        double total;
        
        System.out.println("Ingrese el nombre del primer hijo: ");
        nombre1 = gastos.nextLine();
        System.out.println("Ingrese el nombre del segundo hijo: ");
        nombre2 = gastos.nextLine();
        System.out.println("Ingrese el nombre del tercer hijo: ");
        nombre3 = gastos.nextLine();
        System.out.println("Ingrese los gastos correspondientes de " + nombre1 
                + ": ");
        hijo1 = gastos.nextDouble();
        System.out.println("Ingrese los gastos correspondientes de " + nombre2 
                + ": ");
        hijo2 = gastos.nextDouble();
        System.out.println("Ingrese los gastos correspondientes de " + nombre3 
                + ": ");
        hijo3 = gastos.nextDouble();
        
        total = hijo1+hijo2+hijo3;
        
        System.out.println("El total de gastos de "+nombre1+","+nombre2+" y "
                +nombre3+" es: "+total);
    }
}
