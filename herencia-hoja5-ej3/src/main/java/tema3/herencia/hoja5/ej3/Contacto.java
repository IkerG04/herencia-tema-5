/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.herencia.hoja5.ej3;

import java.time.LocalDate;

/**
 *
 * @author iker
 */
public class Contacto {
    protected String nombre;
    protected String apellidos;
    protected int telefonoMovil;
    protected String email;
    protected LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
}
