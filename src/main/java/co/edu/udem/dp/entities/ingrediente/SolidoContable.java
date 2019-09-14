package co.edu.udem.dp.entities.ingrediente;

public class SolidoContable extends Ingrediente implements Solido {

    public SolidoContable(Long cantidad, ElementoComida comida) {
        super(cantidad, comida);
    }

    @Override
    public Long obtenerCantidad() {
        return null;
    }
}
