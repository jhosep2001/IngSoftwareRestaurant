package co.edu.udem.dp.entities.ingrediente;

public class Carne extends SolidoNoContable {

    private String peso;
    private TipoCarne tipo;
    private String parte;

    public Carne(Long cantidad, ElementoComida comida, String unidadMedida, String peso, TipoCarne tipo, String parte) {
        super(cantidad, comida, unidadMedida);
        this.peso = peso;
        this.tipo = tipo;
        this.parte = parte;
    }
}
