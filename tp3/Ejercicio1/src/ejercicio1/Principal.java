/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author claudio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante medero = new Estudiante();
        medero.nombre = "Malvina Soledad";
        medero.apellido = "Medero";
        medero.curso = "Reposteria";
        medero.calificacion = 9.50;
        
        medero.mostrarInfo();
        
        System.out.println(" ");
        System.out.println("Se sube calificacion:");
        medero.subirCalificacion(0.50);
        medero.mostrarInfo();
        
        System.out.println(" ");
        System.out.println("Se baja calificacion:");
        medero.bajarCalificacion(2.50);
        medero.mostrarInfo();
    }
    
}
