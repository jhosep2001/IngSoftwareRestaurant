package co.edu.udem.dp.services;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
