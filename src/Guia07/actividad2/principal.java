package Guia07.actividad2;

public class principal {

    public static void main(String[] args) {
        Persona_47 persona = new Persona_47("Pepito", "Perez", 19, "902444398", "60745251");
        
        System.out.println("el nombre completo es: "+ persona.obtenerNombreCompleto());
        System.out.println("Es mayor de Edad?????????"+ persona.esMayorDeEdad());
    }
    
}
