package co.edu.udem.dp.reportes;

import co.edu.udem.dp.main.Restaurante;

public abstract class ReporteRestauranteVisitor {

    public abstract void generarReporteVisit(Restaurante restaurante);
}