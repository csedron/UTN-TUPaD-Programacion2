/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author claudio
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfo() {
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(curso);
        System.out.println(calificacion);
    }
    
    void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
}
