/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, descuento, precioFinal;
        String categoria;
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine();
        categoria = categoria.toUpperCase();

        if (categoria.contentEquals("A")){
            descuento = precio * 0.1;
            precioFinal = precio - descuento;
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Precio final: " + precioFinal);
        }
        if (categoria.contentEquals("B")){
            descuento = precio * 0.15;
            precioFinal = precio - descuento;
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Precio final: " + precioFinal);
        }
        if (categoria.contentEquals("C")){
            descuento = precio * 0.2;
            precioFinal = precio - descuento;
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Precio final: " + precioFinal);
        }
    }
    
}
