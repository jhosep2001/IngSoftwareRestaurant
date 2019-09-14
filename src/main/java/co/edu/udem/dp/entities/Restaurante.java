package co.edu.udem.dp.entities;

import co.edu.udem.dp.entities.usuarios.JefeCocina;

public class Restaurante {

    private String especialidad;
    private JefeCocina jefeCocina;
    private String direccion;
    private String telefono;

    public Restaurante(String especialidad, JefeCocina jefeCocina, String direccion, String telefono) {
        this.especialidad = especialidad;
        this.jefeCocina = jefeCocina;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
