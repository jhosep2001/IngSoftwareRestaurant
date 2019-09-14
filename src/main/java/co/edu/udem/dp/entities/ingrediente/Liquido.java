package co.edu.udem.dp.entities.ingrediente;

public class Liquido extends Ingrediente{

    private String unidadMedida;

    public Liquido(Long cantidad, ElementoComida comida, String unidadMedida) {
        super(cantidad, comida);
        this.unidadMedida = unidadMedida;
    }
}
