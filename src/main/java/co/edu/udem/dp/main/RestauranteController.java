package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.Reservable;
import co.edu.udem.dp.entities.Restaurante;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteVisitor;
import co.edu.udem.dp.servicios.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestauranteController {
    private Restaurante restaurante;
    private ServicioReserva servicioReserva = new ServicioReserva();
    private ServicioMesa servicioMesa = new ServicioMesa();
    private ServicioSalon servicioSalon = new ServicioSalon();
    private ServicioPedido servicioPedido = new ServicioPedido();
    private ServicioInventario servicioInventario = new ServicioInventario();

    public RestauranteController(Restaurante restaurante){
        this.restaurante = restaurante;
    }

    List<Mesa> verDisponibilidad(String fechaDeUso){
        List<Reservable> reservas = new ArrayList<>();
        this.servicioReserva.getReservas().forEach( reserva -> {
            if( fechaDeUso.equals(reserva.getFechaDeUso()) ){
                reservas.add(reserva.getReservable());
            }
        });
        return (this.servicioMesa.getMesas().stream().filter(mesa -> !reservas.contains(mesa)).collect(Collectors.toList()));
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public ServicioSalon getServicioSalon() {
        return servicioSalon;
    }

    public ServicioPedido getServicioPedido() {
        return servicioPedido;
    }

    public ServicioInventario getServicioInventario() {
        return servicioInventario;
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
