package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ServicioReserva {
    List<Reserva> reservas = new ArrayList<>();

    public ServicioReserva() {
    }

    public boolean realizarReserva(Usuario usuario, Mesa mesa, MotivoReserva motivoReserva, String fechaDeUso){
        Reserva reserva = new Reserva(usuario, mesa, motivoReserva, fechaDeUso);
        return reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
