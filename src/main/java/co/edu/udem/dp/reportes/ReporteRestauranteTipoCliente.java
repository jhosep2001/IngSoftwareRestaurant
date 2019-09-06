package co.edu.udem.dp.reportes;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.ClienteVip;
import co.edu.udem.dp.main.Restaurante;

public class ReporteRestauranteTipoCliente extends ReporteRestauranteVisitor {

    private  int clientesNormal = 0 , clientesVip = 0;

    @Override
    public void generarReporteVisit(Restaurante restaurante) {
        /*restaurante.getReservas().forEach( reserva -> {
            if(reserva.getUsuario() instanceof ClienteNormal){
                clientesNormal++;
            } else if (reserva.getUsuario() instanceof ClienteVip){
                clientesVip++;
            }
        });*/
        System.out.println("Numero de clientes Normales que han reservado : " + clientesNormal);
        System.out.println("Numero de clientes vip que han reservado : " + clientesVip);
    }
}
