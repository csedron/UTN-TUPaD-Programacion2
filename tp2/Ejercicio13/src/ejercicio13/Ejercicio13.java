/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios (recursivo) — Originales:");
        imprimirRecursivo(precios, 0);
        
        precios[2] = 129.99;

        System.out.println("\nPrecios (recursivo) — Modificados:");
        imprimirRecursivo(precios, 0);
    }

    static void imprimirRecursivo(double[] arr, int i) {
        if (i >= arr.length) {
            return; // caso base
        }
        System.out.println("Precio[" + i + "]: $" + arr[i]);
        imprimirRecursivo(arr, i + 1); // paso recursivo
    }
}