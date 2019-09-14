package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.ingrediente.ElementoComida;
import co.edu.udem.dp.entities.ingrediente.SolidoContable;

public class ConstructorSolidoContable {

    private Long cantidad = 0L;
    private ElementoComida elementoComida = ElementoComida.SAL;

    public ConstructorSolidoContable(){}

    public ConstructorSolidoContable cantidad(long cantidad){
        this.cantidad = cantidad;
        return this;
    }

    public ConstructorSolidoContable elementoComida(ElementoComida elementoComida){
        this.elementoComida = elementoComida;
        return this;
    }

    public SolidoContable construir(){
        return new SolidoContable(this.cantidad, this.elementoComida);
    }
}
