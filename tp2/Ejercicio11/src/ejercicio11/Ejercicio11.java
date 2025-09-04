/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio11 {
    static final double GLOBAL = 0.10;

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, descuentoEspecial, precioFinal;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        precioFinal = calcularDescuentoEspecial(precio);
        descuentoEspecial = precio * GLOBAL;
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        System.out.println("El precio final con descuento es: " + precioFinal);
    
    
    
    
    }
    
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado;
        descuentoAplicado = precio * GLOBAL;
        return precio - descuentoAplicado;
        
        
    }
}
   