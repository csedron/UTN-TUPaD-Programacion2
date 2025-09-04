/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author claudio
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        int vector [] = {132, 235, 25665, 222};
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        
        
        vector[2] = 111;
        System.out.println("");
        System.out.println("Array modificado");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        
    }
}

