package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.fabricas.FabricaMesa;
import co.edu.udem.dp.fabricas.FabricaMotivoReserva;
import co.edu.udem.dp.reportes.ReporteRestauranteVisitor;
import co.edu.udem.dp.services.ServicioMesa;
import co.edu.udem.dp.services.ServicioReserva;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurante {

    private ServicioReserva servicioReserva = new ServicioReserva();
    private ServicioMesa servicioMesa = new ServicioMesa();

    List<Mesa> verDisponibilidad(String fechaDeUso){
        List<Mesa> mesasOcupadas = new ArrayList<>();
        this.servicioReserva.getReservas().forEach( reserva -> {
            if( fechaDeUso.equals(reserva.getFechaDeUso()) ){
                mesasOcupadas.add(reserva.getMesa());
            }
        });
        return (this.servicioMesa.getMesas().stream().filter(mesa -> !mesasOcupadas.contains(mesa)).collect(Collectors.toList()));
    }

    ServicioReserva getServicioReserva() {
        return servicioReserva;
    }

    ServicioMesa getServicioMesa() {
        return servicioMesa;
    }

    public void accept(ReporteRestauranteVisitor visitor){
        visitor.generarReporteVisit(this);
    }
}
