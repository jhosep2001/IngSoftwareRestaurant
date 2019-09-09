package co.edu.udem.dp.reportes.restaurante;

import co.edu.udem.dp.main.RestauranteController;

public interface  ReporteRestauranteVisitor {

    void generarReporteVisit(RestauranteController restaurante);
}
