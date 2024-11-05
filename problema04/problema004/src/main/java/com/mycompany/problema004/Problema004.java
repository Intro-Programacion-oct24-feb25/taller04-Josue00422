/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema004;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema004 {

    public static void main(String[] args) {
          Scanner componentes = new Scanner(System.in);
        
        String nombre;
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = componentes.nextLine();
        System.out.print("Ingrese el costo del CPU: $");
        cpu = componentes.nextDouble();
        System.out.print("Ingrese el costo del teclado: $");
        teclado = componentes.nextDouble();
        System.out.print("Ingrese el valor de la pantalla; $");
        pantalla = componentes.nextDouble();
        System.out.print("Ingrese el valor del ratón: $");
        raton = componentes.nextDouble();
        
        
        total = cpu+pantalla+raton+teclado;
        /*Segun la indicacion al imprimir el resultado debe ser un valor entero
        sin decimlaes algunos !!/esto no(7.oo), entonces para seguir al pie la 
        indicacion cancelamos todos los decimales a la hora de imprimir para que 
        salga un valor exacto ($7)*/
        System.out.printf("Reporte: \nNombres del cliente: %s\nValores "
                + "iniciales:"
                + "\nCPU:  $ %.0f\nTeclado:  $ %.0f\nRatón:  $ %.0f\n"
                + "Pantalla:  $ %.0f\n\n\nValor a cancelar: $%.0f",
                nombre,
                cpu,
                teclado,
                raton,
                pantalla,
                total);

    }
}
