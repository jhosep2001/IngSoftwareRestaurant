package co.edu.udem.dp.reportes.negocio;

import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.main.Negocio;

import java.util.List;

public class ReporteNegocioUsuarios extends ReportesNegocioVisitor {

    private int femenino = 0, masculino = 0;
    @Override
    public void generarReporteVisit(Negocio negocio) {
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
