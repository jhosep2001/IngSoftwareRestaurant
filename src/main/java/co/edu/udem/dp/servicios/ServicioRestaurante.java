package co.edu.udem.dp.servicios;

import co.edu.udem.dp.main.RestauranteController;

import java.util.List;

public class ServicioRestaurante {

    private List<RestauranteController> restaurantes;

    public ServicioRestaurante() {
    }

    public ServicioRestaurante(List<RestauranteController> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void crearRestaurante() {
        //crear un restaurante y un controller Restaurante asociado a el.
    }
}
