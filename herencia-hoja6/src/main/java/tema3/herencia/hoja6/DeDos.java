/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.herencia.hoja6;

/**
 *
 * @author iker
 */
public class DeDos implements Series {

    private int valor;
    private int anterior;

    public DeDos() {
        valor = inicio;
        anterior = inicio - 2;
    }

    @Override
    public int getSiguiente() {
        anterior = valor;
        valor += 2;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor = inicio;
        anterior = inicio - 2;
    }

    @Override
    public void setComenzar(int x) {
        valor = x;
        anterior = inicio - 2;
    }

    public int getAnterior() {
        return anterior;
    }

}
