package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.ingrediente.ElementoComida;
import co.edu.udem.dp.entities.ingrediente.Liquido;

public class ConstructorLiquido {

    private Long cantidad = 0L;
    private ElementoComida elementoComida = ElementoComida.SAL;
    private String unidadMedida = "gr";

    public ConstructorLiquido(){}

    public ConstructorLiquido cantidad(long cantidad){
        this.cantidad = cantidad;
        return this;
    }

    public ConstructorLiquido elementoComida(ElementoComida elementoComida){
        this.elementoComida = elementoComida;
        return this;
    }

    public ConstructorLiquido unidadMedida(String unidadMedida){
        this.unidadMedida = unidadMedida;
        return this;
    }

    public Liquido construir(){
        return new Liquido(this.cantidad, this.elementoComida, this.unidadMedida);
    }
}
