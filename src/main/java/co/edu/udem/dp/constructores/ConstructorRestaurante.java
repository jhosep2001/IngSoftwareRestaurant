package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.Restaurante;
import co.edu.udem.dp.entities.usuarios.JefeCocina;

public class ConstructorRestaurante {

    private String especialidad = "Sin especialidad";
    private JefeCocina jefeCocina = new JefeCocina("Jhon", "Masculino", "jhonyse@hotmail.com", "asdfg");
    private String direccion = "CC Tu sabras";
    private String telefono = "No disponible";

    public ConstructorRestaurante(){}

    public ConstructorRestaurante especialidad(String especialidad){
        this.especialidad = especialidad;
        return this;
    }

    public ConstructorRestaurante jefeCocina(JefeCocina  jefeCocina){
        this.jefeCocina = jefeCocina;
        return this;
    }

    public ConstructorRestaurante telefono(String telefono){
        this.telefono = telefono;
        return this;
    }

    public ConstructorRestaurante direccion(String direccion){
        this.direccion = direccion;
        return this;
    }

    public Restaurante construir(){
        return new Restaurante(this.especialidad, this.jefeCocina, this.direccion, this.telefono);
    }

}
