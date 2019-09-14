package co.edu.udem.dp.entities.ingrediente;

public class SolidoNoContable extends Ingrediente implements Solido{

    private String unidadMedida;


    public SolidoNoContable(Long cantidad, ElementoComida comida, String unidadMedida) {
        super(cantidad, comida);
        this.unidadMedida = unidadMedida;
    }

    @Override
    public Long obtenerCantidad() {
        return null;
    }
}
