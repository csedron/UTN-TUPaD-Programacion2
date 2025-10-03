/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author claudio
 */
public class Gallina {
    // Atributos de la clase
    public String idGallina;
    public int edad;
    public int huevosPuestos;
    
    /**
     * Método para simular que la gallina pone un huevo
     */
    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
        System.out.println("¡" + idGallina + " ha puesto un huevo!");
        System.out.println("Total de huevos puestos: " + huevosPuestos);
    }
    
    /**
     * Método para simular el envejecimiento de la gallina
     */
    public void envejecer() {
        edad = edad + 1;
        System.out.println(idGallina + " ha envejecido. Ahora tiene " + edad + " meses.");
    }
    
    /**
     * Método para mostrar el estado actual de la gallina
     */
    public void mostrarEstado() {
        System.out.println("=== ESTADO DE LA GALLINA ===");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("============================");
    }
}
