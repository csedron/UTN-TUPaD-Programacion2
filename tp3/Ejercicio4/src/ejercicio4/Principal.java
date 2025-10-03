/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author claudio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Gallina gallina1 = new Gallina();
        gallina1.idGallina = "G001";
        gallina1.edad = 6;
        gallina1.huevosPuestos = 12;
        
        Gallina gallina2 = new Gallina();
        gallina2.idGallina = "G002";
        gallina2.edad = 4;
        gallina2.huevosPuestos = 8;
        
        // Mostrar estado inicial
        System.out.println("\nEstado inicial:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Simular acciones
        System.out.println("\nSimulando acciones:");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
        // Mostrar estado final
        System.out.println("\nEstado final:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
        
        
         
             
             
    }
    
}
