package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.entities.salon.Salon;

import java.util.ArrayList;
import java.util.List;

public class ConstructorSalon {
    private List<Mesa> mesas = new ArrayList<>();

    public ConstructorSalon(){}

    public ConstructorSalon agregarMesa(Mesa mesa){
        this.mesas.add(mesa);
        return this;
    }

    public Salon construir(){
        return new Salon(this.mesas);
    }
}
