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
public class Mamifero {
   protected String raza;
   protected int npatas;
   protected String alimento;

    public Mamifero() {
        System.out.println("Raza:");
        raza= new Scanner(System.in).next();
        System.out.println("Numero de patas:");
        npatas= new Scanner(System.in).nextInt();
        System.out.println("Alimento:");
        alimento= new Scanner(System.in).next();
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + " de npatas=" + npatas + " y alimento=" + alimento + '}';
    }
    
    
   
   
}
