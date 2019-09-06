package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.GranChef;
import co.edu.udem.dp.entities.usuarios.JefeCocina;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.services.ServicioUsuario;

import java.util.ArrayList;
import java.util.List;

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
