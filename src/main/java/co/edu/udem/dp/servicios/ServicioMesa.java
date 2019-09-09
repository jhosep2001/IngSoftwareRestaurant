package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.fabricas.FabricaMesa;

import java.util.ArrayList;
import java.util.List;

public class ServicioMesa {
    List<Mesa> mesas = new ArrayList<>();
    public ServicioMesa(){}

    public void anadirMesaConCapacidad(int capacidad){
        Mesa mesa = FabricaMesa.crearMesaConCapacidad(capacidad);
        mesas.add(mesa);
    }

    public void anadirMesaLoungeConCapacidad(int capacidad){
        Mesa mesa = FabricaMesa.crearMesaLoungeConCapacidad(capacidad);
        mesas.add(mesa);
    }

    public List<Mesa> getMesas() {
        return mesas;
    }
}
