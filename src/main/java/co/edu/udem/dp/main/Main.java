package co.edu.udem.dp.main;

import co.edu.udem.dp.constructores.ConstructorClienteNormal;
import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.*;
import co.edu.udem.dp.fabricas.FabricaMotivoReserva;
import co.edu.udem.dp.reportes.negocio.ReporteNegocioUsuarios;
import co.edu.udem.dp.reportes.negocio.ReportesNegocioVisitor;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteTipoCliente;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteTipoMesa;
import co.edu.udem.dp.reportes.restaurante.ReporteRestauranteVisitor;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //Atributos para Mocks
    private static Negocio negocio = new Negocio();

    public static void main (String[] args){
        Restaurante restaurante = negocio.getRestaurante();
        Usuario cliente = new ConstructorClienteNormal()
                .nombre("yasuri")
                .femenino()
                .correo("yasuri@yamile.com")
                .contrasena("empanada")
                .agregarBeneficio(Beneficio.PRIORIDAD)
                .construir();
        negocio.getServicioUsuario().agregarUsuario(cliente);
        restaurante.getServicioMesa().anadirMesaConCapacidad(1);
        restaurante.getServicioMesa().anadirMesaConCapacidad(2);
        restaurante.getServicioMesa().anadirMesaConCapacidad(4);
        restaurante.getServicioMesa().anadirMesaLoungeConCapacidad(4);

        System.out.println("Mesas disponibles para reservar ahora");
        String fechaYa = LocalDateTime.now().plusDays(5).toString();
        List<Mesa> mesasDisponibles = restaurante.verDisponibilidad(fechaYa);

        mesasDisponibles.forEach(mesa -> {
            System.out.println(mesa.getClass().getSimpleName());
        });

        Usuario usuario = negocio.getServicioUsuario().obtenerUsuarioPorNombre("yasuri");
        Mesa mesa = mesasDisponibles.get(0);
        MotivoReserva motivoReserva = FabricaMotivoReserva.crearMotivoDeReservaPara("aniversario");
        restaurante.getServicioReserva().realizarReserva(usuario, mesa, motivoReserva, fechaYa );

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
