package co.edu.udem.dp.entities;

public class Plato {

    private Receta receta;
    private Long precio;

    public Plato(Receta receta, Long precio) {
        this.receta = receta;
        this.precio = precio;
    }

}
