/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        mayor = 0;
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        if (num1 > mayor){
            mayor = num1;
        }
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
