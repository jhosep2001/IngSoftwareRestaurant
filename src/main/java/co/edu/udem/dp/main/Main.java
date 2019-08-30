package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.*;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.motivosReservas.MotivoReservaAniversario;
import co.edu.udem.dp.entities.motivosReservas.MotivoReservaCumpleanos;
import co.edu.udem.dp.entities.usuarios.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Atributos para Mocks
    private static Negocio negocio = new Negocio();

    public static void main (String[] args){
        negocio.crearClienteNormal("yasuri", "yasuri@yamile.com", "holi");
        negocio.getRestaurante().crearMesa(1);
        negocio.getRestaurante().crearMesa(2);
        negocio.getRestaurante().crearMesa(4);
        negocio.getRestaurante().crearMesalounge(4);

        System.out.println("Mesas disponibles para reservar ahora");
        String fechaYA = LocalDateTime.now().plusDays(5).toString();
        List<Mesa> mesasDisponibles = negocio.getRestaurante().verDisponibilidad(fechaYA.split("T")[0]);

        mesasDisponibles.forEach(mesa -> {
            System.out.println(mesa.getClass().getSimpleName());
        });

        Usuario usuario = negocio.getUsuarios().get(0);
        Mesa mesa = mesasDisponibles.get(0);
        MotivoReserva motivoReserva = negocio.getRestaurante().generarMotivoReserva("aniversario");
        negocio.getRestaurante().realizarReserva(usuario, mesa, motivoReserva, fechaYA );

        System.out.println("Numero de reservas: " + negocio.getRestaurante().getReservas().size());
    }

}
