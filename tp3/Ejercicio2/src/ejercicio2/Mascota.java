/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author claudio
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    
    void mostrarInfo () {
        System.out.println(nombre);
        System.out.println(especie);
        System.out.println(edad);
    }
    
    void cumplirAnios (int cumplo) {
        
        edad += cumplo;
    }
           
}
