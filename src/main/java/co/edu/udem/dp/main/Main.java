package co.edu.udem.dp.main;

import co.edu.udem.dp.constructores.ConstructorClienteNormal;
import co.edu.udem.dp.constructores.ConstructorRestaurante;
import co.edu.udem.dp.entities.Restaurante;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.salon.Salon;
import co.edu.udem.dp.entities.usuarios.*;
import co.edu.udem.dp.fabricas.FabricaMesa;
import co.edu.udem.dp.fabricas.FabricaMotivoReserva;
import co.edu.udem.dp.reportes.negocio.ReporteNegocioUsuarios;
import co.edu.udem.dp.reportes.negocio.ReportesNegocioVisitor;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteTipoCliente;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteTipoMesa;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteVisitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    //Atributos para Mocks
    private static NegocioController negocio = new NegocioController();
    private static Mocks mocks = new Mocks();

    public static void main (String[] args){
        mocks.crearMocksDeUsuarios(negocio);
        mocks.crearMocksDeRestaurantes(negocio);
        RestauranteController restaurante = negocio.getServicioRestaurante().obtenerRestaturantePorDireccion("direccion0");

        System.out.println("Mesas disponibles para reservar ahora");
        String fechaYa = LocalDateTime.now().plusDays(5).toString();
        List<Mesa> mesasDisponibles = restaurante.verDisponibilidad(fechaYa);

        mesasDisponibles.forEach(mesa -> {
            System.out.println(mesa.getClass().getSimpleName());
        });

        for(int i = 0; i < 6; i++) {
            Usuario usuario = negocio.getServicioUsuario().obtenerUsuarioPorNombre("cliente1");
            Mesa mesa = mesasDisponibles.get(0);
            MotivoReserva motivoReserva = FabricaMotivoReserva.crearMotivoDeReservaPara("aniversario");
            restaurante.getServicioReserva().realizarReserva(usuario, mesa, motivoReserva, fechaYa);
            negocio.convertirEnClienteVip(usuario);
        }

        System.out.println("numero de reservas hechas: " + restaurante.getServicioReserva().getReservas().size());

        System.out.println("REPORTES \n");
        ReporteRestauranteVisitor reportesRestaurante = new ReporteRestauranteTipoMesa();
        reportesRestaurante.generarReporteVisit(restaurante);
        reportesRestaurante = new ReporteRestauranteTipoCliente();
        reportesRestaurante.generarReporteVisit(restaurante);
        ReportesNegocioVisitor reportesNegocio = new ReporteNegocioUsuarios();
        reportesNegocio.generarReporteVisit(negocio);
    }

}
