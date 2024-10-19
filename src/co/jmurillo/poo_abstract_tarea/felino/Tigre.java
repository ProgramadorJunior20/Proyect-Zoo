package co.jmurillo.poo_abstract_tarea.felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 double tamannioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamannioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }


    @Override
    public String comer() {
        return "El tigre " + especieTigre + " caza presas grandes como ciervos y jabalíes en " + getHabitat() + ".";
    }

    @Override
    public String dormir() {
        return "El tigre duerme en la densa vegetación de " + getHabitat() + ", camuflándose con sus rayas.";
    }

    @Override
    public String correr() {
        return "El tigre puede correr a " + getVelocidad() + " km/h en distancias cortas para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " ruge para marcar su territorio y comunicarse con otros tigres.";
    }
}
