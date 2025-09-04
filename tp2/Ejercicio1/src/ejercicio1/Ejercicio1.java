/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio, bisiesto;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        }else{
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
    
}