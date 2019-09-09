package co.edu.udem.dp.reportes.restaurante;

import co.edu.udem.dp.entities.mesas.*;
import co.edu.udem.dp.main.Restaurante;

import java.util.List;

public class ReporteRestauranteTipoMesa extends ReporteRestauranteVisitor {

    private int mesasIndividual = 0;
    private int mesasPareja = 0;
    private int mesasGrupal = 0;
    private int mesasLounge = 0;


    @Override
    public void generarReporteVisit(Restaurante restaurante) {

        List<Mesa> mesas = restaurante.getServicioMesa().getMesas();
        mesas.forEach(mesa -> {
            if (mesa instanceof MesaIndividual) {
                mesasIndividual++;
            } else if (mesa instanceof MesaPareja) {
                mesasPareja++;
            } else if (mesa instanceof MesaGrupal) {
                mesasGrupal++;
            } else if (mesa instanceof MesaLounge) {
                mesasLounge++;
            }
        });
        System.out.println("REPORTE DE NUMERO DE MESAS DEL RESTAURANTE: ");
        System.out.println("Numero de mesas individuales : " + mesasIndividual);
        System.out.println("Numero de mesas de parejas : " + mesasPareja);
        System.out.println("Numero de mesas grupales : " + mesasGrupal);
        System.out.println("Numero de mesas lounge : " + mesasLounge);
        System.out.println("\n");
    }
}
