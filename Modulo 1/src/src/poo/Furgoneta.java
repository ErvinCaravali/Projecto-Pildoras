package poo;

/**
 *
 * @author Ervin Caravali Ibarra 1925648
 */
public class Furgoneta extends Autos {

    private int capacidad;
    private int plazas;

    public String dimeDatosFurgoneta() {

        return "La capacidad de carga es: " + capacidad + " y las plazas son: " + plazas;

    }

    public Furgoneta(int plazas, int capacidad) {

        super();

        this.capacidad = capacidad;

        this.plazas = plazas;

    }

}
