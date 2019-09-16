package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.ClienteVip;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.servicios.ServicioRestaurante;
import co.edu.udem.dp.servicios.ServicioUsuario;

public class NegocioController {
    private ServicioRestaurante servicioRestaurante;
    private ServicioUsuario servicioUsuario;

    public NegocioController(){
        this.servicioRestaurante = new ServicioRestaurante();
        this.servicioUsuario = new ServicioUsuario();
    }

    public ServicioRestaurante getServicioRestaurante() {
        return servicioRestaurante;
    }

    public ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }

    public void convertirEnClienteVip(Usuario usuario){
        if(servicioRestaurante.esAptoParaVip(usuario)  && !(usuario instanceof ClienteVip)){
            servicioUsuario.convertirClienteEnVip(usuario);
        }
    }
}
