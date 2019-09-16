package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.ingrediente.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class ServicioIngrediente {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public ServicioIngrediente() {

    }

    public ServicioIngrediente(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void añadirIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void modificarIngrediente(Ingrediente ingrediente, Long cantidad) {

    }

    public Boolean verificarIngrediente(Ingrediente ingrediente, Long cantidad) {
        return true;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
