package co.jmurillo.poo_abstract_tarea.main;

import co.jmurillo.poo_abstract_tarea.canino.*;
import co.jmurillo.poo_abstract_tarea.felino.*;
import co.jmurillo.poo_abstract_tarea.select.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        //// Creamos instancias de cada tipo de animal
        Leon leon = new Leon("sabana africana", 1.2, 2.1, 190,
                "pathera leo", 7.5, 80, 15,
                140);
        Tigre tigre = new Tigre("selva asiática", 1.1, 3.0, 220,
                "panthera tigris", 10.0,
                65, "Tigre de Bengala");
        Guepardo guepardo = new Guepardo("Praderas Africanas", 0.9, 1.5, 80,
                "Acinonyx jubatus", 4.0, 120, 20);
        Lobo lobo = new Lobo("Bosque Boreal", 0.8, 1.5, 80,
                "Canis Lupus", "gris",
                6.0, 8, "Lobo Gris");
        PerroSalvajeAfricano perroSalvaje = new PerroSalvajeAfricano("Sabana Africana", 0.75, 1.5,
                30, "Lycaon pictus", "Monteado",
                5.1, 340);

        // Creamos un array de Mamifero para demostrar el polimorfismo
        Mamifero[] mamiferos = {leon, tigre, guepardo, lobo, perroSalvaje};

        // Mostramos información y comportamientos de cada animal
        for (Mamifero mamifero: mamiferos){
            System.out.println("\n--- " + mamifero.getClass().getSimpleName() + " ---");
            System.out.println("Nombre científico: " + mamifero.getNombreCientifico());
            System.out.println("Hábitat: " + mamifero.getHabitat());
            System.out.println("Altura: " + mamifero.getAltura() + " m");
            System.out.println("Largo: " + mamifero.getLargo() + " m");
            System.out.println("Peso: " + mamifero.getPeso() + " kg");
            System.out.println("Comiendo: " + mamifero.comer());
            System.out.println("Durmiendo: " + mamifero.dormir());
            System.out.println("Corriendo: " + mamifero.correr());
            System.out.println("Comunicándose: " + mamifero.comunicarse());

            // Mostramos información específica de cada tipo de animal
            if (mamifero instanceof Felino){
                Felino felino = (Felino) mamifero;
                System.out.println("Tamaño de garras: " + felino.getTamannioGarras() + " cm");
                System.out.println("Velocidad: " + felino.getVelocidad() + " km/h");
            } else if (mamifero instanceof Canino) {
                Canino canino = (Canino) mamifero;
                System.out.println("Color: " + canino.getColor());
                System.out.println("Tamaño de colmillos: " + canino.getTamannioColmillos() + " cm");
            } else {
                System.out.println("Parece que hubo un error!");
            }
        }
    }

}
