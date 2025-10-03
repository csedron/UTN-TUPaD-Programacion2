/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author claudio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: SIMULACIÓN DE NAVE ESPACIAL ===");
        
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Explorer-1", 50);
        
        // Mostrar estado inicial
        System.out.println("\nEstado inicial:");
        nave1.mostrarEstado();
        
        // Intentar avanzar sin suficiente combustible
        System.out.println("\nIntentando avanzar 15 unidades:");
        nave1.avanzar(15);
        
        // Recargar combustible
        System.out.println("\nRecargando combustible:");
        nave1.recargarCombustible(40);
        
        // Intentar avanzar nuevamente
        System.out.println("\nIntentando avanzar 10 unidades:");
        nave1.avanzar(10);
        
        // Mostrar estado final
        System.out.println("\nEstado final:");
        nave1.mostrarEstado();
        
        System.out.println("=== FIN EJERCICIO 5 ===");
    }
    
}
