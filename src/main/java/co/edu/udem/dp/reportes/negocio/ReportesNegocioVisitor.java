package co.edu.udem.dp.reportes.negocio;

import co.edu.udem.dp.main.NegocioController;

public interface ReportesNegocioVisitor {

    void generarReporteVisit(NegocioController negocio);
}
