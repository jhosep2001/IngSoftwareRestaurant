package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.*;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Atributos para Mocks
    private static Negocio negocio = new Negocio();

    public static void main (String[] args){
        negocio.crearClienteNormal("yasuri", "yasuri@yamile.com", "holi");
        negocio.getRestaurante().añadirMesaConCapacidad(1);
        negocio.getRestaurante().añadirMesaConCapacidad(2);
        negocio.getRestaurante().añadirMesaConCapacidad(4);
        negocio.getRestaurante().añadirMesaLoungeConCapacidad(4);

        System.out.println("Mesas disponibles para reservar ahora");
        String fechaYA = LocalDateTime.now().plusDays(5).toString();
        List<Mesa> mesasDisponibles = negocio.getRestaurante().verDisponibilidad(fechaYA);

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
