package co.jmurillo.poo_abstract_tarea.canino;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamannioColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamannioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    // Getters
    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza en manada, compartiendo la presa con su camada de " + numCamada + " individuos.";
    }

    @Override
    public String dormir() {
        return "El lobo " + getColor() + " duerme en las cavernas de " + getHabitat() + " junto a su manada.";
    }

    @Override
    public String correr() {
        return "El lobo corre ágilmente a través de " + getHabitat() + ", alcanzando altas velocidades en la caza.";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " aúlla para comunicarse con su manada y marcar su territorio.";
    }
}
