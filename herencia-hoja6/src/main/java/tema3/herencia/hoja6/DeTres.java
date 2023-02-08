/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.herencia.hoja6;

/**
 *
 * @author DAW106
 */
public class DeTres implements Series{
       private int valor;

    public DeTres() {
        valor=inicio;
    }
    
    
    
    
    @Override
    public int getSiguiente() {
    return valor+3;   
    }

    @Override
    public void reiniciar() {
        valor=inicio;
        System.out.println(valor);
        }

    @Override
    public void setComenzar(int x) {
        valor=x;
        valor+=3;
         }
    
    
}
