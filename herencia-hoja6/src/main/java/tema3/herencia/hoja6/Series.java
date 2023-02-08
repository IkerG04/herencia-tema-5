/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema3.herencia.hoja6;

/**
 *
 * @author iker
 */
public interface Series {
   public int inicio=0;
   
   
   abstract void getSiguiente();
   abstract void reiniciar();
   abstract void setComenzar(int x);
   
   default void mostrarInicio(){
       System.out.println("Inicio:"+inicio);
   }
   
   static void nombreInterfaz(){
       System.out.println("Nombre interfaz Series");
       
       
   }
}