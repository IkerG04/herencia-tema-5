/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema3.herencia.hoja5.ej1;

/**
 *
 * @author iker
 */
public interface AutoAnfibio extends TransporteMaritimo,TransporteTerrestre{

   String marca="Seat";
   String modelo="chariot";

  

    @Override
    public default void andar() {
        System.out.println("Estoy andando");
          }
      @Override
    public default void nadar() {
        System.out.println("Estoy nadando");
          }
    
}
