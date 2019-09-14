package co.edu.udem.dp.entities.ingrediente;

public class SolidoNoContable extends Ingrediente{

    private String unidadMedida;


    public SolidoNoContable(Long cantidad, ElementoComida comida, String unidadMedida) {
        super(cantidad, comida);
        this.unidadMedida = unidadMedida;
    }
}
