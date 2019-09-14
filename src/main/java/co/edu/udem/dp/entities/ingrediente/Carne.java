package co.edu.udem.dp.entities.ingrediente;

public class Carne extends SolidoNoContable {

    private TipoCarne tipo;
    private String parte;

    public Carne(Long cantidad, ElementoComida comida, String unidadMedida, TipoCarne tipo, String parte) {
        super(cantidad, comida, unidadMedida);
        this.tipo = tipo;
        this.parte = parte;
    }
}
