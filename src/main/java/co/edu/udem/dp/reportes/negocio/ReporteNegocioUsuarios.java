package co.edu.udem.dp.reportes.negocio;

import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.main.NegocioController;

import java.util.List;

public class ReporteNegocioUsuarios implements ReportesNegocioVisitor {

    private int femenino = 0, masculino = 0;
    @Override
    public void generarReporteVisit(NegocioController negocio) {
        List<Usuario> usuarios = negocio.getServicioUsuario().getUsuarios();
        usuarios.forEach(usuario -> {
            if(usuario.getGenero().toLowerCase().compareTo("femenino") == 0){
                femenino ++;
            } else masculino++;
        });

        System.out.println("REPORTE USUARIOS");
        System.out.println("NUMERO DE USUARIOS FEMENINOS: " + femenino);
        System.out.println("NUMERO DE USUARIOS MASCULINO: " + masculino);
        System.out.println("\n");
    }
}
