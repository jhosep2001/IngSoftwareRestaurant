package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.Plato;

import java.util.List;

public class ServicioPedido {

    private List<Plato> platos;

    public ServicioPedido() {
    }

    public ServicioPedido(List<Plato> platos) {
        this.platos = platos;
    }

    public void crearPlato(Plato plato) {
        this.platos.add(plato);
    }
}
