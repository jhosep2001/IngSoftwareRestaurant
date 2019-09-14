package co.edu.udem.dp.fabricas;

import co.edu.udem.dp.constructores.ConstructorCarne;
import co.edu.udem.dp.constructores.ConstructorLiquido;
import co.edu.udem.dp.constructores.ConstructorSolidoContable;
import co.edu.udem.dp.constructores.ConstructorSolidoNoContable;

public class FabricaConstructorIngrediente {

    public FabricaConstructorIngrediente(){}

    public ConstructorSolidoContable constructorSolidoContable(){
        return new ConstructorSolidoContable();
    }

    public ConstructorSolidoNoContable constructorSolidoNoContable(){
        return new ConstructorSolidoNoContable();
    }

    public ConstructorLiquido constructorLiquido(){
        return new ConstructorLiquido();
    }

    public ConstructorCarne constructorCarne(){
        return new ConstructorCarne();
    }
}
