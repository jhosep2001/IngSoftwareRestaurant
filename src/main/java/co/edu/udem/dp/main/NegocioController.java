package co.edu.udem.dp.main;

import co.edu.udem.dp.servicios.ServicioUsuario;

public class NegocioController {
    private RestauranteController restaurante;
    private ServicioUsuario servicioUsuario;

    public NegocioController(){
        this.restaurante = new RestauranteController();
        this.servicioUsuario = new ServicioUsuario();
    }

    public RestauranteController getRestaurante() {
        return restaurante;
    }

    public ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }
}
