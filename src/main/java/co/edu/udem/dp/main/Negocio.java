package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.GranChef;
import co.edu.udem.dp.entities.usuarios.JefeCocina;
import co.edu.udem.dp.entities.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    private Restaurante restaurante;
    private List<Usuario> usuarios;

    public Negocio(){
        this.restaurante = new Restaurante();
        this.usuarios = new ArrayList<Usuario>();
    }

    public void crearGranChef(String nombre, String correo, String contraseña){
        usuarios.add(new GranChef(nombre, correo, contraseña));
    }

    public void crearJefeCocina(String nombre, String correo, String contraseña){
        usuarios.add(new JefeCocina(nombre, correo, contraseña));
    }

    public void crearClienteNormal(String nombre, String correo, String contraseña){
        usuarios.add(new ClienteNormal(nombre, correo, contraseña));
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
