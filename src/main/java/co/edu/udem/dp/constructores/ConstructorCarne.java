package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.ingrediente.Carne;
import co.edu.udem.dp.entities.ingrediente.ElementoComida;
import co.edu.udem.dp.entities.ingrediente.TipoCarne;

public class ConstructorCarne {

    private Long cantidad = 0L;
    private ElementoComida elementoComida = ElementoComida.SAL;
    private String unidadMedida = "gr";
    private TipoCarne tipo = TipoCarne.RES;
    private String parte = "Solomo";

    public ConstructorCarne(){}

    public ConstructorCarne cantidad(long cantidad){
        this.cantidad = cantidad;
        return this;
    }

    public ConstructorCarne elementoComida(ElementoComida elementoComida){
        this.elementoComida = elementoComida;
        return this;
    }

    public ConstructorCarne unidadMedida(String unidadMedida){
        this.unidadMedida = unidadMedida;
        return this;
    }

    public ConstructorCarne tipo(TipoCarne tipo){
        this.tipo = tipo;
        return this;
    }

    public ConstructorCarne parte(String parte){
        this.parte = parte;
        return this;
    }

    public Carne construir(){
        return new Carne(this.cantidad, this.elementoComida, this.unidadMedida, this.tipo, this.parte);
    }
}
