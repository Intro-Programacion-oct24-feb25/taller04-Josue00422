/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner area = new Scanner(System.in);
        
        double base;
        double altura;
        double formula;
        
        System.out.println("Ingrese la base del triangulo: ");
        base = area.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = area.nextDouble();
        
        formula = (base * altura)/2;
        
        System.out.println("El area del triangulo es: "+formula);
        
    }
}
