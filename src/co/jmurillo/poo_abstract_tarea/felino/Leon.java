package co.jmurillo.poo_abstract_tarea.felino;

public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamannioGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    // Getters


    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras de " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El León duerme en la sabana bajo la sombra de un árbol";
    }

    @Override
    public String correr() {
        return "El León corre a una velocidad de " + getVelocidad() + " km/h persiguiendo a su presa";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles para marcar su territorio";
    }
}
