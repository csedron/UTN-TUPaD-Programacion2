/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author claudio
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    Scanner input = new Scanner(System.in);
    


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
     public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    


    public void validacion(int entrada) {
        
        while (entrada <=0 ){
            System.out.print("Ingrese un año valido: ");
            entrada = Integer.parseInt(input.nextLine());
            
        }
        anioPublicacion = entrada;
        
    }
    
    
    
}
