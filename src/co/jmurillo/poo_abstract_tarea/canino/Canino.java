package co.jmurillo.poo_abstract_tarea.canino;

import co.jmurillo.poo_abstract_tarea.select.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected double tamannioColmillos;

    public Canino(String habitat, double altura, double largo, double peso,
                  String nombreCientifico, String color, double tamannioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamannioColmillos = tamannioColmillos;
    }

    // Getters adicionales

    public String getColor() {
        return color;
    }

    public double getTamannioColmillos() {
        return tamannioColmillos;
    }
}
