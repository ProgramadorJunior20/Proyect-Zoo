package co.jmurillo.poo_abstract_tarea.canino;

public class PerroSalvajeAfricano extends Canino {
    private int fuerzaMordidaPsi;

    public PerroSalvajeAfricano(String habitat, double altura, double largo, double peso,
                                String nombreCientifico, String color, double tamannioColmillos, int fuerzaMordidaPsi) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamannioColmillos);
        this.fuerzaMordidaPsi = fuerzaMordidaPsi;
    }

    public int getFuerzaMordidaPsi() {
        return fuerzaMordidaPsi;
    }


    @Override
    public String comer() {
        return "El perro salvaje africano caza en manada, persiguiendo presas como antílopes en " + getHabitat() +
                " con una fuerza de mordida de " + fuerzaMordidaPsi + " PSI.";
    }

    @Override
    public String dormir() {
        return "Los perros salvajes africanos " + getColor() + " duermen juntos en madrigueras o áreas densas de " +
                getHabitat() + " para protegerse.";
    }

    @Override
    public String correr() {
        return "El perro salvaje africano puede mantener una velocidad de hasta 60 km/h durante largas distancias, " +
                "agotando a sus presas en persecuciones de resistencia.";
    }

    @Override
    public String comunicarse() {
        return "Los perros salvajes africanos se comunican con una variedad de sonidos, incluyendo chillidos, " +
                "ladridos y 'cantos' para coordinar la caza y mantener la cohesión del grupo.";
    }
}
