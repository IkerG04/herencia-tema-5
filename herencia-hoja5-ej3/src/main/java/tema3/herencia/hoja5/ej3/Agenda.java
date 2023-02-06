/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.herencia.hoja5.ej3;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class Agenda {

    private int contador;
    private Contacto numContactos[];

    public Agenda(int contador, Contacto[] numContactos) {
        this.contador = 0;
        System.out.println("Introduzca el numero de contactos que desee:");
        this.numContactos = new Contacto[new Scanner(System.in).nextInt()];
    }

    public void insertar(Contacto contacto) {
        for (int i = 0; i < numContactos.length; i++) {
            if (contador < numContactos.length) {
                numContactos[i] = contacto;
            } else {
                System.out.println("No se pueden añadir mas contactos");
            }
        }
    }

    public void buscar(String nombre) {
        System.out.println("Escriba el nombre para buscar el contacto");
        nombre = new Scanner(System.in).next();
        for (int i = 0; i < contador; i++) {
            if (nombre == numContactos[i].getNombre()) {
                System.out.println("Se encontro el contacto en la posicion" + i);
            } else {
                System.out.println("No se pudo encontrar el contacto");
            }
        }
    }

    public void eliminar(String nombre) {
        System.out.println("Escriba el nombre para borrar el contacto");
        nombre = new Scanner(System.in).next();
        for (int i = 0; i < contador; i++) {
            if (nombre == numContactos[i].getNombre()) {
                System.out.println("Se borro el contacto en la posicion" + i);
                numContactos[i] = null;
                contador--;
                
            } else {
                System.out.println("No se pudo encontrar el contacto");
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda{" + "contador=" + contador + ", numContactos=" + numContactos + '}';
    
    }
    
    
    public void ordenar(){
        
    }
}


