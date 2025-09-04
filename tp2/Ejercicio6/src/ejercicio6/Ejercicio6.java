/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int positivos, negativos, ceros, num;
        positivos = 0;
        negativos = 0;
        ceros = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i < 11; i++){
            System.out.print("Ingrese el número " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            if (num == 0){
                ceros += 1;
            }
            if (num < 0){
                negativos += 1;
            }
            if (num > 0){
                positivos += 1;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);        
    }
    
}