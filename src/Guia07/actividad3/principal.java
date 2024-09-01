
package Guia07.actividad3;

public class principal {

    public static void main(String[] args) {
        Auto_47 auto = new Auto_47("Toyota", "Rojo", "R45-4N0", 200.50, 2024);
        
        System.out.println("descripcion del auto "+ auto.obtenerDatosDeAuto());
        System.out.println("kilometraje del auto "+ auto.obtenerKilometraje());
    }
    
}
