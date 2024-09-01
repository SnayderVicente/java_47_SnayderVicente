/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad2;

/**
 *
 * @author user
 */
public class Persona_47 {
    public String nombre;
    public String apellido;
    public int edad;
    public String telefono;
    public String dni;

    public Persona_47() {
    }

    public Persona_47(String nombre, String apellido, int edad, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    public String obtenerNombreCompleto(){
        return nombre + " "+apellido;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    } 
    
}
