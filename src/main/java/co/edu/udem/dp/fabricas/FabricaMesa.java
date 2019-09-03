package co.edu.udem.dp.fabricas;

import co.edu.udem.dp.entities.mesas.*;

public class FabricaMesa {

    public static Mesa crearMesaConCapacidad (int capacidad){
        if(capacidad == 1){
            return new MesaIndividual(capacidad);
        } else if (capacidad == 2){
            return new MesaPareja(capacidad);
        } else {
            return new MesaGrupal(capacidad);
        }
    }

    public static Mesa crearMesaLoungeConCapacidad (int capacidad){
        return new MesaLounge(capacidad);
    }
}
