/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        while (num != 0){
            if (num % 2 == 0){
                suma += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
    
}
