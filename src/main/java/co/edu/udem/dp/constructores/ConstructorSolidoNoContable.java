package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.ingrediente.ElementoComida;
import co.edu.udem.dp.entities.ingrediente.SolidoNoContable;

public class ConstructorSolidoNoContable {

    private Long cantidad = 0L;
    private ElementoComida elementoComida = ElementoComida.SAL;
    private String unidadMedida = "gr";

    public ConstructorSolidoNoContable(){}

    public ConstructorSolidoNoContable cantidad(long cantidad){
        this.cantidad = cantidad;
        return this;
    }

    public ConstructorSolidoNoContable elementoComida(ElementoComida elementoComida){
        this.elementoComida = elementoComida;
        return this;
    }

    public ConstructorSolidoNoContable unidadMedida(String unidadMedida){
        this.unidadMedida = unidadMedida;
        return this;
    }

    public SolidoNoContable construir(){
        return new SolidoNoContable(this.cantidad, this.elementoComida, this.unidadMedida);
    }
}
