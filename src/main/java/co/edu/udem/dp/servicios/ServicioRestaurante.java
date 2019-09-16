package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.Reserva;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.main.RestauranteController;

import java.util.ArrayList;
import java.util.List;

public class ServicioRestaurante {

    private List<RestauranteController> restaurantes = new ArrayList<>();

    public ServicioRestaurante() {
    }

    public ServicioRestaurante(List<RestauranteController> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void crearRestaurante(RestauranteController restaurante) {
        restaurantes.add(restaurante);
    }

    public RestauranteController obtenerRestaturantePorDireccion(String direccion){
        for (RestauranteController restauranteController: restaurantes) {
            if(restauranteController.getRestaurante().getDireccion().toLowerCase().equals(direccion)){
                return restauranteController;
            }
        }
        return null;
    }

    public boolean esAptoParaVip(Usuario usuario){
        int contadorDeReservas = 0;
        for (RestauranteController restaurante: restaurantes){
            for (Reserva reserva: restaurante.getServicioReserva().getReservas()) {
                if(reserva.getUsuario().equals(usuario)){
                    contadorDeReservas ++;
                }
            }
        }
        return contadorDeReservas >= 5;
    }
}
