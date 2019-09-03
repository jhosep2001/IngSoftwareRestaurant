package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.fabricas.FabricaMesa;
import co.edu.udem.dp.reportes.ReporteRestauranteVisitor;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurante {

    private List<Reserva> reservas = new ArrayList<>();
    private List<Mesa> mesas = new ArrayList<>();
    private List<Reserva> listaDeEspera = new ArrayList<>();

    public boolean realizarReserva(Usuario usuario, Mesa mesa, MotivoReserva motivoReserva, String fechaDeUso){
        Reserva reserva = new Reserva(usuario, mesa, motivoReserva, fechaDeUso);
        return reservas.add(reserva);
    }

    public void añadirMesaConCapacidad( int capacidad){
        mesas.add(FabricaMesa.crearMesaConCapacidad(capacidad));
    }

    public void añadirMesaLoungeConCapacidad(int capacidad){
        mesas.add(FabricaMesa.crearMesaLoungeConCapacidad(capacidad));
    }

    public List<Mesa> verDisponibilidad(String fechaDeUso){
        List<Mesa> mesasOcupadas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime fechaSolicitud = LocalDateTime.parse(fechaDeUso, DateTimeFormatter.ISO_LOCAL_DATE);
        this.reservas.forEach( reserva -> {
            LocalDateTime fechaOcupado = LocalDateTime.parse(reserva.getFechaDeUso(), formatter);
            if( fechaSolicitud.isEqual(fechaOcupado) ){
                mesasOcupadas.add(reserva.getMesa());
            }
        });
        return (this.mesas.stream().filter(mesa -> !mesasOcupadas.contains(mesa)).collect(Collectors.toList()));
    }

    public MotivoReserva generarMotivoReserva(String motivo){
        Reserva reserva = new Reserva();
        reserva.añadirMotivoReserva(motivo);
        return reserva.getMotivoReserva();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void accept(ReporteRestauranteVisitor visitor){
        visitor.generarReporteVisit(this);
    }
}
