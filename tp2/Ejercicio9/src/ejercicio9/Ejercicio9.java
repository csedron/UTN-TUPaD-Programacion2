/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  pesoPaquete, precio, costoEnvio, total;
        String zonaEnvioString;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvioString = input.nextLine();
        calcularCostoEnvio(precio, zonaEnvioString);
        total = calcularTotalCompra(precio, calcularCostoEnvio(pesoPaquete, zonaEnvioString));
        costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvioString);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }
        
    static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")){
           return peso * 5;
                      
        }
        if (zona.equalsIgnoreCase("Internacional")){
           return peso * 10;
                      
        }
        return 0;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }

 }