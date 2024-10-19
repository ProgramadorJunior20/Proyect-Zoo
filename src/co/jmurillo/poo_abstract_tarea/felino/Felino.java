package co.jmurillo.poo_abstract_tarea.felino;

import co.jmurillo.poo_abstract_tarea.select.Mamifero;

abstract public class Felino extends Mamifero {
    protected double tamannioGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso,
                  String nombreCientifico, double tamannioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamannioGarras = tamannioGarras;
        this.velocidad = velocidad;
    }

    // Getters adicionales
    public double getTamannioGarras() {
        return tamannioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
