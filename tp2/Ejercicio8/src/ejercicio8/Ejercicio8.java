/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioBase, impuesto, descuento, precioFinal;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }
    
    static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double precioFinal;
        precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        
        return  precioFinal;
    }
    
}
