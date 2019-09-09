package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteVisitor;
import co.edu.udem.dp.servicios.ServicioMesa;
import co.edu.udem.dp.servicios.ServicioReserva;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestauranteController {

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

    public ServicioReserva getServicioReserva() {
        return servicioReserva;
    }

    public ServicioMesa getServicioMesa() {
        return servicioMesa;
    }

    public void accept(ReporteRestauranteVisitor visitor){
        visitor.generarReporteVisit(this);
    }
}
