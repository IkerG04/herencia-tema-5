/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.herencia.hoja5.ej2;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Gato extends Mamifero{
    private String nombre;
    

    
    
    public Gato() {
        System.out.println("Nombre:");
        nombre = new Scanner(System.in).next();
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + '}';
    }
    
    
    
}
