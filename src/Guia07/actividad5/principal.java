package Guia07.actividad5;

public class principal {

    public static void main(String[] args) {
        libro_47 libro = new libro_47("messi", "cursiva", "THE GOAT", 2024, true);
        System.out.println("El libro del autor "+ libro.autor +" titulado "+ libro.titulo + " que contiene letra "+ libro.tipoDeLetra + " fue publicado en el año "+ libro.añoDePublicacion + " ¿y es verdad que aun sigue disponible? respondame en ingles: "+ libro.disponibilidad);
    }
}
