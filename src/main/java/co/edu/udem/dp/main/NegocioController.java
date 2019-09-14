package co.edu.udem.dp.main;

import co.edu.udem.dp.servicios.ServicioRestaurante;
import co.edu.udem.dp.servicios.ServicioUsuario;

public class NegocioController {
    private ServicioRestaurante servicioRestaurantes;
    private ServicioUsuario servicioUsuario;

    public NegocioController(){
        this.servicioRestaurantes = new ServicioRestaurante();
        this.servicioUsuario = new ServicioUsuario();
    }

    public ServicioRestaurante getRestaurante() {
        return servicioRestaurantes;
    }

    public ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }
}
