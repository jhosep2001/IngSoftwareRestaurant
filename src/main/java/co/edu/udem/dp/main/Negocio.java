package co.edu.udem.dp.main;

import co.edu.udem.dp.servicios.ServicioUsuario;

public class Negocio {
    private Restaurante restaurante;
    private ServicioUsuario servicioUsuario;

    public Negocio(){
        this.restaurante = new Restaurante();
        this.servicioUsuario = new ServicioUsuario();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }
}
