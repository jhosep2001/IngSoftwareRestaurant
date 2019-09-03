package co.edu.udem.dp.fabricas;

import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;

public class FabricaMotivoReserva {

    public static MotivoReserva crearMotivoDeReservaPara(String nombre){
        return new MotivoReserva(nombre);
    }
}
