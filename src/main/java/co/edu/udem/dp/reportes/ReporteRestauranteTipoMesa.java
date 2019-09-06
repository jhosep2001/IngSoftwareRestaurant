package co.edu.udem.dp.reportes;

import co.edu.udem.dp.entities.mesas.MesaGrupal;
import co.edu.udem.dp.entities.mesas.MesaIndividual;
import co.edu.udem.dp.entities.mesas.MesaLounge;
import co.edu.udem.dp.entities.mesas.MesaPareja;
import co.edu.udem.dp.main.Restaurante;

public class ReporteRestauranteTipoMesa extends ReporteRestauranteVisitor {

    private int mesasIndividual = 0;
    private int mesasPareja = 0;
    private int mesasGrupal = 0;
    private int mesasLounge = 0;


    @Override
    public void generarReporteVisit(Restaurante restaurante) {
        /*restaurante.getReservas().forEach(reserva -> {
            if (reserva.getMesa() instanceof MesaIndividual) {
                mesasIndividual++;
            } else if (reserva.getMesa() instanceof MesaPareja) {
                mesasPareja++;
            } else if (reserva.getMesa() instanceof MesaGrupal) {
                mesasGrupal++;
            } else if (reserva.getMesa() instanceof MesaLounge) {
                mesasLounge++;
            }
        });*/

        System.out.println("Numero de mesas individuales que han reservado : " + mesasIndividual);
        System.out.println("Numero de mesas de parejas que han reservado : " + mesasPareja);
        System.out.println("Numero de mesas grupales que han reservado : " + mesasGrupal);
        System.out.println("Numero de mesas lounge que han reservado : " + mesasLounge);
    }
}
