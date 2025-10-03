/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author claudio
 */
public class NaveEspacial {
    // Atributos de la clase
    public String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    
    /**
     * Constructor de la clase
     */
    public NaveEspacial(String nombreNave, double combustibleInicial) {
        nombre = nombreNave;
        if (combustibleInicial >= 0 && combustibleInicial <= COMBUSTIBLE_MAXIMO) {
            combustible = combustibleInicial;
        } else {
            combustible = 0;
            System.out.println("Combustible inicial inválido. Se estableció en 0.");
        }
    }
    
    /**
     * Método para simular el despegue
     */
    public void despegar() {
        if (combustible >= 10) {
            combustible = combustible - 10;
            System.out.println("¡" + nombre + " ha despegado!");
            System.out.println("Combustible consumido: 10 unidades");
        } else {
            System.out.println("Error: No hay suficiente combustible para despegar");
        }
    }
    
    /**
     * Método para avanzar una distancia
     */
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 5;
        
        if (combustible >= combustibleNecesario) {
            combustible = combustible - combustibleNecesario;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
            System.out.println("Combustible consumido: " + combustibleNecesario + " unidades");
        } else {
            System.out.println("Error: Combustible insuficiente para avanzar " + distancia + " unidades");
            System.out.println("Combustible necesario: " + combustibleNecesario);
            System.out.println("Combustible disponible: " + combustible);
        }
    }
    
    /**
     * Método para recargar combustible
     */
    public void recargarCombustible(double cantidad) {
        if (cantidad > 0) {
            double nuevoCombustible = combustible + cantidad;
            
            if (nuevoCombustible <= COMBUSTIBLE_MAXIMO) {
                combustible = nuevoCombustible;
                System.out.println("Se han recargado " + cantidad + " unidades de combustible.");
            } else {
                combustible = COMBUSTIBLE_MAXIMO;
                System.out.println("Se ha llenado el tanque. Combustible máximo: " + COMBUSTIBLE_MAXIMO);
            }
        } else {
            System.out.println("Error: La cantidad a recargar debe ser mayor a 0");
        }
    }
    
    /**
     * Método para mostrar el estado de la nave
     */
    public void mostrarEstado() {
        System.out.println("=== ESTADO DE LA NAVE ESPACIAL ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
        System.out.println("=================================");
    }
    
    // Getter para combustible
    public double getCombustible() {
        return combustible;
    }
}
