package co.jmurillo.poo_abstract_tarea.felino;

public class Guepardo extends Felino {
    private double aceleracion;

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                    double tamannioGarras, int velocidad, double aceleracion) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannioGarras, velocidad);
        this.aceleracion = aceleracion;
    }

    public double getAceleracion() {
        return aceleracion;
    }


    @Override
    public String comer() {
        return "El guepardo caza presas medianas como gacelas en las llanuras de " + getHabitat() +
                ", usando su increíble velocidad de " + getVelocidad() + " km/h.";
    }

    @Override
    public String dormir() {
        return "El guepardo descansa en las sombras de árboles o en pequeñas colinas en " + getHabitat() +
                " para vigilar su territorio.";
    }

    @Override
    public String correr() {
        return "El guepardo es el felino más rápido, acelerando de 0 a " + getVelocidad() +
                " km/h en solo " + (getVelocidad() / 3.6 / aceleracion) +
                " segundos con una aceleración de " + aceleracion + " m/s^2.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo no ruge como otros grandes felinos, pero emite sonidos suaves como maullidos y ronroneos para comunicarse.";
    }
}
