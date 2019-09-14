package co.edu.udem.dp.entities.ingrediente;

public abstract class Ingrediente {

    private Long cantidad;
    private ElementoComida comida;

    public Ingrediente(Long cantidad, ElementoComida comida) {
        this.cantidad = cantidad;
        this.comida = comida;
    }

}
