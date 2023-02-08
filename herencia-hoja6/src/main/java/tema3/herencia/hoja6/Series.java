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
   
   int getSiguiente();
   void reiniciar();
   void setComenzar(int x);
   
   default public void mostrarInicio(){
       System.out.println("Inicio:"+inicio);
   }
   
   public static void nombreInterfaz(){
       System.out.println("Interfaz Series");       
   }
}