package co.edu.udem.dp.reportes.restaurante;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.ClienteVip;
import co.edu.udem.dp.main.Restaurante;

import java.util.List;

public class ReporteRestauranteTipoCliente extends ReporteRestauranteVisitor {

    private  int clientesNormal = 0 , clientesVip = 0;

    @Override
    public void generarReporteVisit(Restaurante restaurante) {
        List<Reserva> reservas = restaurante.getServicioReserva().getReservas();
        reservas.forEach( reserva -> {
            if(reserva.getUsuario() instanceof ClienteNormal){
                clientesNormal++;
            } else if (reserva.getUsuario() instanceof ClienteVip){
                clientesVip++;
            }
        });
        System.out.println("REPORTE DE RESERVAS");
        System.out.println("Numero de clientes Normales que han reservado : " + clientesNormal);
        System.out.println("Numero de clientes vip que han reservado : " + clientesVip);
        System.out.println("\n");
    }
}
