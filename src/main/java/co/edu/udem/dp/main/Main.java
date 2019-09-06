package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.*;
import co.edu.udem.dp.fabricas.FabricaMotivoReserva;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Atributos para Mocks
    private static Negocio negocio = new Negocio();

    public static void main (String[] args){
        negocio.getServicioUsuario().crearClienteNormal("yasuri", "yasuri@yamile.com", "holi");
        negocio.getRestaurante().getServicioMesa().anadirMesaConCapacidad(1);
        negocio.getRestaurante().getServicioMesa().anadirMesaConCapacidad(2);
        negocio.getRestaurante().getServicioMesa().anadirMesaConCapacidad(4);
        negocio.getRestaurante().getServicioMesa().anadirMesaLoungeConCapacidad(4);

        System.out.println("Mesas disponibles para reservar ahora");
        String fechaYa = LocalDateTime.now().plusDays(5).toString();
        List<Mesa> mesasDisponibles = negocio.getRestaurante().verDisponibilidad(fechaYa);

        mesasDisponibles.forEach(mesa -> {
            System.out.println(mesa.getClass().getSimpleName());
        });

        Usuario usuario = negocio.getServicioUsuario().obtenerUsuarioPorNombre("yasuri");
        Mesa mesa = mesasDisponibles.get(0);
        MotivoReserva motivoReserva = FabricaMotivoReserva.crearMotivoDeReservaPara("aniversario");
        negocio.getRestaurante().getServicioReserva().realizarReserva(usuario, mesa, motivoReserva, fechaYa );

        System.out.println("numero de reservas hechas: " + negocio.getRestaurante().getServicioReserva().getReservas().size());
    }

}
