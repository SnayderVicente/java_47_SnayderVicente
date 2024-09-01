package Guia07.actividad3;

public class Auto_47 {
    String marca;
    String color;
    String placa;
    double kilometraje;
    int anio;

    public Auto_47() {
    }

    public Auto_47(String marca, String color, String placa, double kilometraje, int anio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.anio = anio;
    }
    
    public double obtenerKilometraje(){
        return kilometraje; 
    }
    public String obtenerDatosDeAuto(){
        return marca + " " + placa + " " + color + " " + anio;
    }
}
