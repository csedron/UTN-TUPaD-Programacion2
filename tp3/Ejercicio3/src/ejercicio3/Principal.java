/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

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
        int entrada;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese año publicacion: ");
        entrada = Integer.parseInt(input.nextLine());
        Libro java = new Libro();
        
        java.setAutor("Sedron Claudio.");
        java.setTitulo("Aprenda Java.");
        java.validacion(entrada);
        
        System.out.println("Titulo: " + java.getTitulo());
        System.out.println("Autor: " + java.getAutor());
        System.out.println("Año publicacion: " + java.getAnioPublicacion());
        
        
        
    }
    
}
