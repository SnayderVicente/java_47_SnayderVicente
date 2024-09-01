package Guia07.actividad4;

public class animal_47 {
    String nombre;
    String especie;
    int edad;
    double peso;

    public animal_47() {
    }

    public animal_47(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
    
    public void emitirSonido(String sonido){
        System.out.println(nombre + " hace un sonido: " + sonido);
    }
    public void alimentarMascota(double cantidadDeComida){
        System.out.println(nombre + " ha sido alimentada con: " + cantidadDeComida +" Kg de Comida");
    }
}
