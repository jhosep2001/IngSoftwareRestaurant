package co.edu.udem.dp.entities;

import co.edu.udem.dp.entities.ingrediente.Ingrediente;

import java.util.HashMap;
import java.util.Map;

public class Receta {

    private String nombre = "Sin nombre";
    private Map<Ingrediente, Long> ingredientes = new HashMap<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Ingrediente, Long> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Map<Ingrediente, Long> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
