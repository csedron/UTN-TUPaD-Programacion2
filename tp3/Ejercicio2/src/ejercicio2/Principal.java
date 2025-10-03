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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mascota gato = new Mascota();
        gato.nombre = "pipi";
        gato.especie = "felino";
        gato.edad = 3;
        
        System.out.println("Muestro datos de mascota");
        gato.mostrarInfo();
        System.out.println(" ");
        
        System.out.println("Aumento edad de " + gato.nombre);
        
        System.out.print("Ingrese cuantos años cumple su mascota: ");
        gato.cumplirAnios(input.nextInt());
        gato.mostrarInfo();
        System.out.println(" ");
        
    }
    
}
